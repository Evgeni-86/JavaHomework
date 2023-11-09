package player;

import java.nio.file.Path;

public interface PlayerInterface {
    void setSong(Path path);
    void play();
    void stop();
    boolean isPlay();
    boolean isError();
}
