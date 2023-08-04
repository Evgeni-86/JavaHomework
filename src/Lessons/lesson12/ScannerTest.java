package Lessons.lesson12;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(Paths.get("NewTest.txt"));
            while (scanner.hasNext()){
                System.out.println(scanner.next());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
