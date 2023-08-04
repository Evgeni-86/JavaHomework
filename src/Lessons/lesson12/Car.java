package Lessons.lesson12;

import java.io.IOException;
import java.nio.CharBuffer;

public class Car implements Readable{
    String name;

    @Override
    public int read(CharBuffer cb) throws IOException {
        return 0;
    }
}
