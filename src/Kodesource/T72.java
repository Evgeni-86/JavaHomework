//Напишите программу на Java для создания новой строки,
// в которой первые три символа взяты из данной строки.
// Если длина данной строки меньше 3, используйте «#»
// в качестве заменяющих символов.

package Kodesource;

import java.util.Arrays;

public class T72 {
    public static void main(String[] args) {
        String str1 = "aa";
        String newString = new String(getFirstChars(str1, 3));
        System.out.println(newString);
    }

    static String getFirstChars(String input, int quantityChar) {
        char[] ch;
        if (input.length() < quantityChar) {
            ch = new char[input.length()];
            Arrays.fill(ch, '#');
        } else {
            ch = new char[quantityChar];
            input.getChars(0, quantityChar, ch, 0);
        }
        return String.copyValueOf(ch);
    }
}
