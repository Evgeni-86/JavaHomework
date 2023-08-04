package Lessons.lesson3;

import java.util.Scanner;

public class Basket {
    public static void main(String[] args) {
        String[] names = {"Молоко", "Хлеб", "Гречка", "Рис"};
        double[] price = {12.15, 45.78, 78.98, 23.41};
        String[] basket = new String[0];
        Scanner scanner = new Scanner(System.in);

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
            if (position.length == 2 && //проверка на корректность ввода
                    position[0].chars().allMatch(Character::isDigit) &&
                    position[1].chars().allMatch(Character::isDigit) &&
                    Integer.parseInt(position[0]) <= names.length) {

                int num = Integer.parseInt(position[0]);
                int quantity = Integer.parseInt(position[1]);
                //выбираем товар
                String name = names[num - 1];
                double curPrice = price[num - 1];

                //если товар уже есть в корзине
                for (int i = 0; i < basket.length; i++) {
                    String[] curElementInfo = basket[i].split(",");
                    if (curElementInfo[0].equalsIgnoreCase(name)) {
                        basket[i] = name + "," + String.valueOf(Integer.parseInt(curElementInfo[1]) + quantity)
                                + "," + curPrice;
                        continue outer; //выполняем внешний цикл сначала
                    }
                }
                //-----------------------------------

                //новый массив больше на одну ячейку
                String[] newBasket = new String[basket.length + 1];

                //перезапишем старый массив в новый
                for (int i = 0; i < basket.length; i++) {
                    newBasket[i] = basket[i];
                }

                //запись в последнюю, созданную ячейку
                newBasket[newBasket.length - 1] = name + "," + quantity + "," + curPrice;
                basket = newBasket;

            } else {
                System.out.println("Проверте ввод!");
            }

        }

        System.out.println("-------------------------------------------------");
        System.out.println("Ваша корзина:");
        String formatHead = "%-20s | %-20s | %-20s | %-20s %n";
        String formatTable = "%-20s | %-20s | %-20s | %-20.2f %n";
        String formatTotal = "%-20s  %-21s | %-20s | %-20.2f %n";
        System.out.printf(formatHead, "Наименование товара", "Количество", "Цена за ед.", "Общая стоимость");
        double total = 0;

        for (String el : basket) {
            String[] spl = el.split(",");
            double sum = Double.parseDouble(spl[1]) * Double.parseDouble(spl[2]);
            total += sum;
            System.out.printf(formatTable, spl[0], spl[1], spl[2], sum);
        }

        System.out.printf(formatTotal, "", "", "Итого", total);
    }

}
