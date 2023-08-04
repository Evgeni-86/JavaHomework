package Lessons.lesson12.IOclass.WorkTest;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;

public class FileInputOutputStreamDemo {
    public static void main(String[] args) {

        String d = "src/io";
        File dir = new File(d);
        dir.mkdirs();
        if (dir.exists()){
            System.out.println("directory created");
        }

        try (OutputStream output = new FileOutputStream(new File(d, "a.txt"));
             InputStream input = new FileInputStream(new File(d, "a.txt"));
        ) {

            char[] symbols = {'a', 'b', 'c'};

            for (char ch : symbols) {
                output.write(ch);
            }

            int ch;
            while ((ch = input.read()) != -1){
                System.out.print((char) ch);
            }

        } catch (IOException e) {
            System.out.print("Exception");
        }
    }
}
