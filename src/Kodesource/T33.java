package Kodesource;

import java.util.Scanner;

public class T33 {
    public static void main(String[] args) {
        int sum = 0;

        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        StringBuilder sbInput = new StringBuilder(String.valueOf(input));

        while (sbInput.length() > 0) {
            int firstNumber = Character.digit(sbInput.charAt(0), 10);
            sbInput.delete(0,1);
            sum += firstNumber;
        }

        System.out.println(sum);
    }
}
