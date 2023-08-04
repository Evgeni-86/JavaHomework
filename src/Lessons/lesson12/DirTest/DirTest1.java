package Lessons.lesson12.DirTest;

import java.io.File;

public class DirTest1 {
    public static void main(String[] args) {
        File dir = new File("TestDir");
        dir.mkdir();
    }
}
