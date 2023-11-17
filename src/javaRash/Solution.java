package javaRash;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.concurrent.ExecutionException;
import java.util.stream.Collectors;


public class Solution {
    public static void main(String[] args) {
        try (
//                Scanner scanner = new Scanner(System.in);
                InputStream fis = Files.newInputStream(Paths.get("test.txt"));
                OutputStream fos = Files.newOutputStream(Paths.get("testOut.txt"))
        ) {

//            int temp = -1;
//            while (fis.available() > 0) {
//                if (temp != -1) fos.write(temp);
//                temp = fis.read();
//                int second = fis.read();
//                if (second != -1) fos.write(second);
//            }
//            if (temp != -1) fos.write(temp);

            byte[] buffer = new byte[2];
            int temp = -1;
            while (fis.available() > 0) {
                int real = fis.read(buffer);
                for (int i = 0; i < fis.read(buffer); i++) {
                    if (temp == -1) temp = buffer[i];
                    else {
                        fos.write(buffer[i]);
                        fos.write(temp);
                        temp = -1;
                    }
                }
            }
            if (temp != -1) fos.write(temp);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
