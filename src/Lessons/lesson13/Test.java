package Lessons.lesson13;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Path path = Paths.get("src/Office/Reports/m.202102.csv");

        if (Files.exists(path)) {
            try {

                List<String> report = Files.readAllLines(path);
                for (String s : report) {
                    System.out.println(s);
                }


            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
