/*
Напишите программу на Java, чтобы проверить, содержит ли данная
 строка все уникальные символы.
Пример вывода: Исходная строка: xyyz
В строке есть все уникальные символы: false
*/

package Kodesource;

import java.util.HashSet;

public class T141 {
    public static void main(String[] args) {
        String s = "xyyz";
        System.out.println(test(s));
    }

    public static boolean test(String s) {
        HashSet<Character> characters = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            characters.add(s.charAt(i));
        }
        return characters.size() == s.length();
    }
}
