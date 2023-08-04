package Kodesource;

import java.util.Iterator;
import java.util.Locale;
import java.util.Scanner;

public class T20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arr =  {"A","B","C","D","E","F"};
        long number = scanner.nextLong();
        long remainder = 0;
        String[] arrRezult = new String[30];

        int counter = 0;
        while (number != 0) {
            remainder = number - ((number / 16) * 16);
            Integer numInt = (int) (long) remainder;
            if (remainder >= 10) {
                    arrRezult[counter++] = arr[numInt - 10];
                } else {
                    arrRezult[counter++] = numInt.toString();
                }
            number = number / 16;
        }
        --counter;
        while (counter >= 0) {
            System.out.printf(arrRezult[counter--]);
        }
    }
}
