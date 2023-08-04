package Lessons.lesson04;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        String[] names = {"Молоко", "Хлеб", "Гречка", "Рис"};
        double[] price = {12.15, 45.78, 78.98, 23.41};
        int[] basket = new int[names.length];
        Scanner scanner = new Scanner(System.in);
        double total = 0;
        System.out.println("Список товаров для покупки");
        for (int i = 0; i < names.length; i++) {
            System.out.println((i + 1) + " " + names[i] + " " + price[i]);
        }

        outer:
        while (true) {
            System.out.println("Выберите товар и количество или введите \"end\"");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("end")) {
                break;
            }
            String[] position = input.split(" ");
            int productIndex = Integer.parseInt(position[0]) - 1;
            int poductCoun = Integer.parseInt(position[1]);
            total = (total + poductCoun * price[productIndex]);
            basket[productIndex] = poductCoun;
        }

        System.out.println("Ваша корзина:");
        String formatHead = "%-20s | %-20s | %-20s | %-20s %n";
        String formatTable = "%-20s | %-20s | %-20s | %-20.2f %n";
        String formatTotal = "%-20s  %-21s | %-20s | %-20.2f %n";
        System.out.printf(formatHead, "Наименование товара", "Количество", "Цена за ед.", "Общая стоимость");

        for (int i = 0; i < basket.length; i++) {
            if(basket[i] != 0) {
                System.out.printf(formatTable, names[i], basket[i], price[i], basket[i] * price[i]);
            }
        }
        System.out.printf(formatTotal, "", "", "Итого", total);


    }
}
