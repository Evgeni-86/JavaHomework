package player;

import java.io.BufferedInputStream;
import java.nio.file.Files;
import java.nio.file.Path;

import javazoom.jl.player.Player;


class Mp3Player implements PlayerInterface, Runnable {

    private Path songPath;
    private Player player;
    private boolean isPlay = false;
    private boolean isPlayerError = false;

    @Override
    public void setSong(Path path) {
        this.songPath = path;
    }

    @Override
    public void play() {
        try (BufferedInputStream buffer = new BufferedInputStream(Files.newInputStream(songPath))) {
            player = new Player(buffer);
            String filePath = songPath.toString();
            String name = songPath.toString().substring(filePath.lastIndexOf('\\') + 1);
            isPlay = true;
            System.out.println("сейчас воспроизводится: " + name);
            player.play();
        } catch (Exception ex) {
            ex.printStackTrace();
            isPlayerError = true;
        } finally {
            stop();
        }
    }

    @Override
    public void run() {
        play();
    }

    @Override
    public void stop() {
        if (player != null) {
            player.close();
            isPlay = false;
        }
    }

    @Override
    public boolean isPlay() {
        return isPlay;
    }

    @Override
    public boolean isError() {
        return isPlayerError;
    }
}