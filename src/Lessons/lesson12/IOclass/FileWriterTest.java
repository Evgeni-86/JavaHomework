package Lessons.lesson12.IOclass;

import java.io.*;

public class FileWriterTest {
    public static void main(String[] args) throws IOException {

        String s = "Hello world";

//        File file = new File("testFile.txt");

        FileWriter fileWriter = null;

        try {
            fileWriter = new FileWriter("testFile.txt");

            char ch;

            for (int i = 0; i < s.length(); i++) {
                fileWriter.write(s.charAt(i));
            }


        }
        catch (FileNotFoundException e) {
            e.fillInStackTrace();
        }
        finally {
            fileWriter.close();
        }

    }
}
