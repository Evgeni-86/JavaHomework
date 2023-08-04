package Kodesource;

import java.util.Scanner;

//Напишите программу на Java, которая принимает число и проверяет,
// является ли число четным или нет. Печатает 1, если число четное,
// или 0, если число нечетное.
public class T49 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число или введите end");
        while (true) {
            String numberInput = scanner.nextLine();
            if (numberInput.equalsIgnoreCase("end")) {
                break;
            }
            char num = numberInput.charAt(0);
            if (!Character.isDigit(num)) {
                continue;
            }
            if (Integer.parseInt(numberInput) % 2 == 0) {
                System.out.println("1");
                System.out.println("--------------");
            } else if (Integer.parseInt(numberInput) % 2 == 1) {
                System.out.println("0");
                System.out.println("--------------");
            }
        }
    }
}
