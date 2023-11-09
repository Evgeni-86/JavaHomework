package player;

import java.nio.file.Path;

class Run {
    public static void main(String[] args) {
        Controller.setPlayer(new Mp3Player());
        Controller.setPlayList(Path.of("src\\player\\playlist\\"));
        Controller.setTimer(0);
        Controller.play();
    }
}
