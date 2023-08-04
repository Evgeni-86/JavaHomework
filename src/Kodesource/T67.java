package Kodesource;

import java.util.Arrays;

//Напишите программу на Java для вставки слова в середину другой строки
public class T67 {
    public static void main(String[] args) {
        String str = "sadjkhkjh hjkhkjhkjh hjkhkhk hjkhkjhkjh hjhkjhkj hjhkjhk hjhkh";
        String strInser = "Учебник";

        System.out.println(inputWordMedium(str, strInser));
    }

    static String inputWordMedium(String str, String strInsert) {
        String[] arrStr = str.split(" ");
        String[] new1 = Arrays.copyOfRange(arrStr, 0, arrStr.length / 2);
        String[] new2 = Arrays.copyOfRange(arrStr, arrStr.length / 2, arrStr.length);
        return getString(new1) + " " + strInsert + " " + getString(new2);
    }

    static String getString(String[] args) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < args.length; i++) {
                sb.append(args[i] + " ");
        }
        sb.delete(sb.length() - 1, sb.length());//удалим последний пробел
        return sb.toString();
    }
}
//Нормально ли такое решение