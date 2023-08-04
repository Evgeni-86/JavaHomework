//Напишите Java-программу, начинающуюся с целого числа n,
// разделите n на 2, если n четное, или умножьте на 3, и
// добавьте 1, если n нечетное, повторяйте процесс до n = 1.

package Kodesource;

import java.util.Scanner;

public class T86 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNum = scanner.nextInt();
        test(inputNum);
    }

    static void test(int number) {
        while (number > 1) {
            if (number % 2 == 0) {
                number /= 2;
            } else {
                number = number * 3 + 1;
            }
            System.out.println(number);
        }
    }

}
