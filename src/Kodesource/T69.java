//Напишите программу на Java для извлечения первой половины строки четной длины.

package Kodesource;

public class T69 {
    public static void main(String[] args) {
        String input = "aaaaaaaaa aaaa aaaaaaaaa aa aaaaaaaaaaaaa";
        System.out.println(getFirstPositiveHalf(input));
    }

    static String getFirstPositiveHalf(String input) {
        StringBuilder sb = new StringBuilder(input);

        if ((sb.length() / 2) % 2 == 0) {
            sb.delete((sb.length() / 2), sb.length());
        } else {
            sb.delete((sb.length() / 2) - 1, sb.length());
        }
        return sb.toString();

    }
}
