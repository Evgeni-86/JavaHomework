package Kodesource;

import java.util.Scanner;

public class T32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1;
        int num2;

        for (int i = 0; i < 2; i++) {
            System.out.print("Введите первое число: ");
            num1 = scanner.nextInt();
            System.out.print("Введите второе число: ");
            num2 = scanner.nextInt();


            if (num1 == num2) {
                System.out.printf("%d == %d %n", num1, num2);
            }
            if (num1 > num2) {
                System.out.printf("%d > %d %n", num1, num2);
            }
            if (num1 < num2) {
                System.out.printf("%d < %d %n", num1, num2);
            }
            if (num1 >= num2) {
                System.out.printf("%d >= %d %n", num1, num2);
            }
            if (num1 <= num2) {
                System.out.printf("%d <= %d %n", num1, num2);
            }
        }
    }
}
