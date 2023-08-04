package Sber.Dz1path3;
//ПОДСЧЕТ ОТ БАЗОВОГО ЧИСЛА

import java.util.Scanner;

public class Z8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);

        int rezult = 0;

        System.out.println("Введите количество чисел");
        int quantity = scanner.nextInt();

        System.out.println("Введите от какого числа считать");
        int numberBase = scanner.nextInt();

        System.out.println("Введите " + quantity + " чисел в формате 1 2 3 ... N");
        System.out.println("----------------------------------------");
        String inputNumbers = scanner1.nextLine();
        String[] strArr = inputNumbers.split(" ");

        for (int i = 0; i < strArr.length; i++) {
            int elem = Integer.parseInt(strArr[i]);
            if (elem > numberBase) {
                rezult += elem;
            }
        }

        System.out.println("--------------------------------------------");
        System.out.println("Сумма чисел:");
        System.out.println(rezult);
    }


}
