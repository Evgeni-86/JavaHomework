package Zaur.IOandNIO;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class CopyFileTree {

    public static void main(String[] args) {
        Path dir = Paths.get("C:/Users/evgeni/Desktop/Test");
        Path destination = Paths.get("C:/Users/evgeni/Desktop/TestCopy");

        try {
            Files.walkFileTree(dir, new MyFileVisitor(dir, destination));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

class MyFileVisitor extends SimpleFileVisitor<Path> {

    Path source;
    Path destination;

    public MyFileVisitor(Path source, Path destination) {
        //источник для копирования
        this.source = source;
        //куда копируем
        this.destination = destination;
    }


    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
        //новый путь dir ( this.destination соединяем с путем dir (относительно источника для копирования) )
        Path newDestination = destination.resolve(source.relativize(dir));
        //копируем dir по новому пути
        Files.copy(dir, newDestination, StandardCopyOption.REPLACE_EXISTING);
        return FileVisitResult.CONTINUE;
    }

    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        Path newDestination = destination.resolve(source.relativize(file));
        Files.copy(file, newDestination,StandardCopyOption.REPLACE_EXISTING);
        return FileVisitResult.CONTINUE;
    }

}
