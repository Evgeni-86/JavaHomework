package base64;

import DZ3.IsLike;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

@IsLike(value = true)
public class Test {
    public static void main(String[] args) {

        Base64.Encoder encoder = Base64.getEncoder();
        Base64.Decoder decoder = Base64.getDecoder();

        Path path = Path.of("test.txt");
        Path pathWrite = Path.of("testOut.txt");

        try (BufferedInputStream bufferedInputStream = new BufferedInputStream(Files.newInputStream(path));
             OutputStream outputStream = encoder.wrap(Files.newOutputStream(pathWrite));
             BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream);

             InputStream inputStream = decoder.wrap(Files.newInputStream(pathWrite));
             BufferedInputStream bufferedInputStream1 = new BufferedInputStream(inputStream);
        ) {

            byte[] buffer = new byte[256];
            while (bufferedInputStream.available() > 0) {
                int lastBytes = bufferedInputStream.read(buffer);
                bufferedOutputStream.write(buffer, 0, lastBytes);
            }
            bufferedOutputStream.close();


            while (bufferedInputStream1.available() > 0) {
                int lastBytes = bufferedInputStream1.read(buffer);
                System.out.print(new String(buffer, 0, lastBytes));
            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}