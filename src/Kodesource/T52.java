package Kodesource;

import java.io.FilterOutputStream;
import java.util.Scanner;

//Напишите программу на Java для вычисления суммы двух целых чисел
// и верните true, если сумма равна третьему целому числу
public class T52 {
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число");
        a = scanner.nextInt();
        System.out.println("Введите второе число");
        b = scanner.nextInt();
        System.out.println("Введите третье число");
        c = scanner.nextInt();

        System.out.println(test(a, b, c, true));
    }

    static boolean test(int a, int b, int c, boolean abc) {
        if (abc) {
            return c > b;
        }
        return c > b && b > a;

    }

}
