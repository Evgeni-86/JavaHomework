package Lessons.lesson09.StepTraker2;

import java.util.Scanner;

public class Menu {
    private Menu() {
    }

    static public int showBasicMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("-------------Меню--------------");
        System.out.println("-Ввести данные-------------[1]-");
        System.out.println("-Изменить цель по шагам----[2]-");
        System.out.println("-Показать статистику-------[3]-");
        System.out.println("-Выход---------------------[4]-");
        System.out.print("-Сделайте выбор:");
        int input = scanner.nextInt();
        return input;
    }

    static public int[] showInputMenu() {
        int[] data = new int[3];
        Scanner scanner = new Scanner(System.in);
        System.out.print("-Введите номер месяца:");
        data[0] = scanner.nextInt() - 1;
        System.out.print("-Введите номер дня:");
        data[1] = scanner.nextInt() - 1;
        System.out.print("-Введите количество шагов:");
        data[2] = scanner.nextInt();
        return data;
    }

    static public int showChangeTargetMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("-Введите новую цель:");
        int input = scanner.nextInt();
        return input;
    }

    static public int showStatisticMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("-Введите номер месяца статистики:");
        int input = scanner.nextInt();
        return input - 1;
    }
}
