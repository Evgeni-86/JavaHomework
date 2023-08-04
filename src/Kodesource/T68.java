//Напишите программу на Java для создания новой строки
// из 4 копий последних 3 символов исходной строки.
// Длина исходной строки должна быть от 3 и выше.
// 3.0  ==>  3.03.03.03.0
package Kodesource;

public class T68 {
    public static void main(String[] args) {
        String input = "3.0";
        System.out.println(getCopyLast(input,3,4));
    }

    static String getCopyLast(String inputStr, int quantityChars, int quantityCopy) {
        StringBuilder sb = new StringBuilder(inputStr);
        char[] charArr = new char[quantityChars];
        sb.getChars(inputStr.length() - quantityChars, inputStr.length(), charArr, 0);
        String lastChars = String.copyValueOf(charArr);

        for (int i = 0; i < quantityCopy - 1; i++) {
            sb.append(lastChars);
        }

        return sb.toString();
    }
}
