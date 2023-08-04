//Напишите программу на Java для создания и объединения двух строк,
// за исключением удаления первого символа каждой строки.
// Длина строк должна быть от 1 и выше.

package Kodesource;

public class T71 {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Java";
        System.out.println(delFirstChar(str1) + delFirstChar(str2));
    }

    static String delFirstChar(String input) {
        StringBuilder sb = new StringBuilder(input);
        sb.delete(0, 1);
        return sb.toString();
    }
}
