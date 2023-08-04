package Kodesource;

import java.util.Scanner;
//преобразования двоичного числа в десятичное число
public class T22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        //перевод числа в строку
        String input = String.valueOf(number);
        double rezult = 0;

        for (int i = 0; i < input.length(); i++) {
            //двигаемся справа на лево по символам
            char c = input.charAt(input.length() - 1 - i);
            //преобразуем символ в целое число
            int el = Character.getNumericValue(c);
            rezult = rezult + (el * (Math.pow(2, i)));
        }
        System.out.println(rezult);
    }
}
