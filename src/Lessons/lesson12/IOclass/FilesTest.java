package Lessons.lesson12.IOclass;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilesTest {
    public static void main(String[] args) {

        String s= "ASD";

        try {
            Path path = Paths.get("testFile.txt");
            Files.write(path, s.getBytes());


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
