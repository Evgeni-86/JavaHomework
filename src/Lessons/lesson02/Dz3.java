package Lessons.lesson02;

import java.util.Scanner;

public class Dz3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        //-------------------------------------------
        if ( x >= 12 ) {
            System.out.println("Обед!");
        } else {
            System.out.println("Рано");
        }
        //-------------------------------------------
    }
}
