package base64;

import java.io.*;
import java.nio.CharBuffer;
import java.nio.file.*;
import java.nio.file.Paths;

public class Test {
    public static void main(String[] args) {

        try (

                InputStream inputStream = Files.newInputStream(Path.of("test.txt"));
                BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        ) {

            byte[] buffer = new byte[99];
            int bytes;

            while ((bytes = bufferedInputStream.read(buffer)) != -1) {

                for (int i = 0; i < bytes; i++) {
                    System.out.print(buffer[i] + " ");
                }


            }

        } catch (IOException exception) {
            exception.printStackTrace();
        }


    }
}