/*
Написать метод который циклически просматривает содержимое заданного
 каталога и выводит на печать информацию о всех файлах и каталогах,
 находящихся в нем и в его подкаталогах.
Используем рекурсию.
*/

package Examclouds.IOandNIO;

import java.io.File;

public class DirInfoRecursion {
    public static void main(String[] args) {
        System.out.println(test("src/lessons"));
    }

    static public String test(String d) {

        File dir = new File(d);

        try {
            for (File file : dir.listFiles()) {
                if (file.isDirectory()) {
                    System.out.println();
                    System.out.println("Directory : " + file.getPath());
                    test(file.getPath());
                } else {
                    System.out.println("File : " + file.getName());
                }
            }
        } catch (NullPointerException e) {
            e.printStackTrace();
        }

        return "Done";
    }
}
