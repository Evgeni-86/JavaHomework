package Lessons.lesson12.IOclass;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferReaderTest {
    public static void main(String[] args) throws IOException {

        BufferedReader bReader = null;

        try {
            bReader = new BufferedReader(new FileReader("testFile.txt"));

            int ch;
            while ((ch = bReader.read()) != -1){
                System.out.print((char) ch);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        finally {
            bReader.close();
        }

    }
}
