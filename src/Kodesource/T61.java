package Kodesource;

//Напишите программу на Java, чтобы перевернуть слово
public class T61 {
    public static void main(String[] args) {
        String input = "Hello";
        System.out.println(reverseWord(input));
    }

    static String reverseWord(String input) {
        StringBuilder sb = new StringBuilder(input);
        return sb.reverse().toString();
    }
}
