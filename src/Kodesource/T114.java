/*
Напишите Java-программу с заданной строкой и смещением,
 поверните строку по смещению (поверните слева направо).
 asdfghj => 4 => fghj asd

*/

package Kodesource;

import java.util.LinkedList;

public class T114 {
    public static void main(String[] args) {
        String str = "asdfghj";
        System.out.println(test(str));
    }

    static String test(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(sb.substring(0, 3)).delete(0, 3);
        return sb.toString();
    }
}
