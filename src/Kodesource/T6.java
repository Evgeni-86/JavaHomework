package Trainer;

import java.util.Scanner;

public class T6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//----------------------------------------------------
        for (int i = 0; i < 4; i++) {
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();
            int rez = 0;
            switch (i) {
                case 0: rez = num1 + num2; break;
                case 1: rez = num1 - num2; break;
                case 2: rez = num1 * num2; break;
                case 3: rez = num1 / num2; break;
            }
            System.out.println(rez);
        }
//----------------------------------------------------
    }
}
