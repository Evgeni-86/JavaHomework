//Напишите программу на Java, которая берет последние три символа
// из заданной строки и добавляет эти три символа в начале и в конце
// строки. Длина строки должна быть больше трех и более.

package Kodesource;

import Lessons.lesson07.FurnitureFactory.Chair;

public class T84 {
    public static void main(String[] args) {
        String input = "assghghghgfdd";
        System.out.println(newString(input, 3));

    }

    public static String newString(String str, int number) {
        StringBuilder sb = new StringBuilder(str);
        String sumbols = sb.substring(sb.length() - number, sb.length());
        sb.append(sumbols);
        sb.insert(0,sumbols);
        return sb.toString();
    }
}
