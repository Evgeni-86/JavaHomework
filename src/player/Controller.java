package player;

import java.io.IOException;
import java.nio.file.*;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;


class Controller {
    private Controller() {
    }

    private static PlayerInterface player;
    private static Thread playerThread;
    private static int timer;
    private final static List<Path> PLAYLIST = new ArrayList<>();
    private final static List<Integer> HISTORY = new ArrayList<>();
    private static int counter;

    public static void setPlayer(PlayerInterface player) {
        Controller.player = player;
    }

    public static void setPlayList(Path path) {
        try (Stream<Path> pathStream = Files.walk(path)) {
            pathStream.forEach((el) -> {
                if (Files.isRegularFile(el))
                    PLAYLIST.add(el);
            });
        } catch (IOException ex) {
            System.out.println("ошибка чтения дирректории");
            ex.printStackTrace();
        }
    }

    public static void play() {
        if (counter == PLAYLIST.size()) {
            System.out.println("конец плейлиста");
            return;
        }

        int nextTrackIndex = getNextTrackIndex();
        player.setSong(PLAYLIST.get(nextTrackIndex));
        playerThread = new Thread((Runnable) player);
        playerThread.start();
        HISTORY.add(nextTrackIndex);
        counter++;
        startControlPlayer();
    }

    private static int getNextTrackIndex() {
        Random random = new Random();
        int indexNextSong = random.nextInt(PLAYLIST.size());
        while (HISTORY.contains(indexNextSong))
            indexNextSong = random.nextInt(PLAYLIST.size());
        return indexNextSong;
    }


    public static void stop() {
        player.stop();
    }

    public static void next() {
        stop();
        play();
    }

    public static void setTimer(int seconds) {
        if (seconds >= 0)
            timer = seconds;
    }

    private static void startControlPlayer() {
        while (!player.isError() && !player.isPlay())
            System.out.println("загрузка...");

        if (player.isError())
            next();

        if (timer == 0) {
            try {
                playerThread.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        } else {

            while (player.isPlay()) {
                System.out.println("воспроизведение остановиться через: " + timer--);
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
                if (timer == 0) {
                    stop();
                    return;
                }
            }
        }

        next();
    }
}

