package ioAndNio;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class CombineZipFile {
    public static void main(String[] args) {
        File temp;

        try {
            temp = File.createTempFile("temp", null);

            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(temp));
            for (String currentFile : args) {
                System.out.println("currentFile " + currentFile);
                try (BufferedInputStream bus = new BufferedInputStream(new FileInputStream(currentFile))) {
                    while (bus.available() > 0) {
                        bos.write(bus.read());
                    }
                    bos.flush();
                    System.out.println("currentFile " + currentFile + " done!");
                }
            }
            bos.close();

            ZipInputStream zipInputStream = new ZipInputStream(new FileInputStream(temp));
            ZipEntry current;
            while ((current = zipInputStream.getNextEntry()) != null) {
                String name = current.getName();
                BufferedOutputStream bos2 = new BufferedOutputStream(new FileOutputStream(name));
                while (zipInputStream.available() > 0) {
                    bos2.write(zipInputStream.read());
                }
                bos2.close();
                System.out.println(name + " Done!");
            }
            zipInputStream.close();

        } catch (IOException e) {
            throw new RuntimeException();
        }
    }
}
