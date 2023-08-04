package Trainer;

import java.util.Scanner;

public class T19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long num = scanner.nextInt();

        long[] rezult = new long[20];
        long divisionResult = num;

        int counter = 0;
        while (divisionResult != 0) {
            rezult[counter++] = divisionResult % 2;
            divisionResult = divisionResult / 2;
        }
        --counter;
        while (counter >= 0) {
            System.out.print(rezult[counter--] + " ");
        }
    }
}
