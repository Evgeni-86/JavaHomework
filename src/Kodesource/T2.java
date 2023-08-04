package Kodesource;

import java.util.Scanner;

public class T2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rezult = 0;
        for (int i = 0; i < 2; i++) {
            int number = scanner.nextInt();
            rezult += number;
        }
        System.out.println(rezult);
    }
}
