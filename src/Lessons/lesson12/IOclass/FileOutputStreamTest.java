package Lessons.lesson12.IOclass;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest {
    public static void main(String[] args) throws IOException {

        String s = "Hello";

        File file = new File("testFile2.txt");

        FileOutputStream fileOutputStream = null;

        try {
            fileOutputStream = new FileOutputStream(file);

            int a;
            for(int i = 0; i < s.length(); i++){
                a = s.charAt(i);
                fileOutputStream.write(a);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        finally {
            fileOutputStream.close();
        }

    }
}
