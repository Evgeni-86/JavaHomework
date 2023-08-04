package Kodesource;

//Напишите программу на Java, которая будет использовать первую букву каждого слова в предложении
public class T58 {
    public static void main(String[] args) {
        String input = "Быстрая коричневая  лиса прыгает через   ленивую собаку";

        StringBuilder sb = new StringBuilder(input);
        String[] strArr = input.split(" ");

        for (String element : strArr) {
            element.trim();
            if (element.length() > 0) {
                char ch = element.charAt(0);
                System.out.println(ch);
            }
        }

    }
}
