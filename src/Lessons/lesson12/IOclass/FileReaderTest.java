package Lessons.lesson12.IOclass;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {
    public static void main(String[] args) throws IOException {

        try (FileReader fileReader = new FileReader("testFile.txt")) {

            int ch;
            while ((ch = fileReader.read()) != -1){
                System.out.print((char) ch);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
