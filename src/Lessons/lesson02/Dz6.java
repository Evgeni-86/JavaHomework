package Lessons.lesson02;

import java.util.Scanner;

public class Dz6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        //----------------------------------------------------
        if (count < 500) {
            System.out.println("Начинащий");
        } else if (count >= 500 && count < 1500) {
            System.out.println("Ниже среднего");
        } else if (count >= 1500 && count < 2500) {
            System.out.println("Средний");
        } else if (count >= 2500 && count < 3500) {
            System.out.println("Выше среднего");
        } else if (count >= 3500) {
            System.out.println("Владеющий");
        }
        //----------------------------------------------------
    }
}
