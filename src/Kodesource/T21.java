package Kodesource;

import java.util.Scanner;

public class T21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] arrRezult = new String[20];
        int number = scanner.nextInt();
        int remainder = 0;

        int counter = 0;
        while (number != 0) {
            remainder = number - (number / 8) * 8;
            String str = String.valueOf(remainder);
            arrRezult[counter++] = str;
            number = number / 8;
        }
        --counter;
        while (counter >= 0) {
            System.out.printf(arrRezult[counter--]);
        }
    }
}
