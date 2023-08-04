package Lessons.lesson01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int dayOfweek = scanner.nextInt();

        if (dayOfweek == 6 || dayOfweek == 7) {
            System.out.println("Выходные");
        } else {
            System.out.println(6 - dayOfweek);
        }

    }

}