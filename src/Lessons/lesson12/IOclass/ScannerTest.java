package Lessons.lesson12.IOclass;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) throws IOException {

        File file = new File("testFile.txt");

        try (Scanner scanner = new Scanner(Paths.get("testFile.txt"))) {

            while (scanner.hasNext()){
                System.out.println(scanner.next());
            }


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
