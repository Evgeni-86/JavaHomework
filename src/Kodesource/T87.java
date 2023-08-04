//Напишите программу на Java, затем прочитайте целое число,
// вычислите сумму его цифр и напишите номер каждой
// цифры суммы на английском языке.

package Kodesource;

import java.util.Scanner;

public class T87 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNum = scanner.nextInt();
        numberText(test(inputNum));
    }

    static int test(int input) {
        String strInput = String.valueOf(input);
        int sum = 0;

        for (int i = 0; i < strInput.length(); i++) {
            char ch = strInput.charAt(i);
            int n = ch - '0';
            sum += n;
        }
        return sum;
    }

    static void numberText(int input) {
        String[] nameIntArr = {"zero", "one", "two", "three", "fore", "five", "six", "seven", "eight", "nine"};
        String strInput = String.valueOf(input);
        StringBuilder textSum = new StringBuilder();

        for (int i = 0; i < strInput.length(); i++) {
            char ch = strInput.charAt(i);
            int n = ch - '0';
            textSum.append(nameIntArr[n]).append(" ");
        }
        System.out.println(textSum.toString());
    }
}
