package Sber.Dz1path3;

import java.util.Scanner;

public class Z4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int m = scanner.nextInt();
        String str = String.valueOf(m);
        for ( int i = 0; i < str.length(); i++) {
            char simbol = str.charAt(i);
            System.out.println(simbol);
        }
    }
}
