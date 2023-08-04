package Lessons.lesson12;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FilesTest {
    public static void main(String[] args) {
        String s1 = "Hello World!";

        //читает байты и записывает в файл
        try {
            Files.write(Paths.get("C:\\Users\\evgeni\\Desktop\\FileTest.txt"), s1.getBytes());
        } catch (IOException e) {
            System.out.println("Неудалось записать в файл");
            e.printStackTrace();
        }


    }
}
