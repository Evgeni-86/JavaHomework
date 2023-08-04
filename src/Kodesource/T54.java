package Kodesource;

//Напишите программу на Java, которая принимает три целых числа
// от пользователя и возвращает true, если два или более из них (целые числа)
// имеют одинаковую самую правую цифру. Целые числа неотрицательны
public class T54 {
    public static void main(String[] args) {
        int num1 = 20;
        int num2 = 32;
        int num3 = 22;

        System.out.println(test(num1, num2, num3));

    }

    static boolean test(int a, int b, int c) {

        int[] numbers = {a, b, c};
        char rezult = 0;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < numbers.length; i++) {
            sb.append(numbers[i]);
            char ch = sb.charAt(sb.length() - 1);
            if (ch == rezult) {
                return true;
            }
            sb.setLength(0);
            rezult = ch;
        }
        return false;


    }
}
