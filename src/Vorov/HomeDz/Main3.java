package Vorov.HomeDz;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
//        LinkedList<Integer> listInt = new LinkedList<>();
//        listInt.add(1);
//        listInt.add(2);
//        listInt.add(3);
//        listInt.add(4);
//        listInt.add(5);
//        for (Integer integer : listInt) {
//            System.out.println(integer);
//        }
//
//        LinkedList<String> ListStr = new LinkedList<>();
//        Scanner scanner = new Scanner(System.in);
//        for (int i = 0; i < 5; i++) {
//            String newStr = scanner.nextLine();
//            ListStr.add(newStr);
//        }
//        System.out.println(ListStr.size());
//        for (String string : ListStr) {
//            System.out.println(string);
//        }
//
//        LinkedList<Integer> linkInt2 = new LinkedList<>();
//        Integer scanner2 = scanner.nextInt();
//        while (scanner2 != 0) {
//            scanner2 = scanner.nextInt();
//            if (scanner2 % 2 == 0) {
//                linkInt2.addFirst(scanner2);
//            } else {
//                linkInt2.addLast(scanner2);
//            }
//        }
//        for (Integer integer : linkInt2) {
//            System.out.println(integer);
//        }
/////////////////////////////////////////////////////////////////////
        LinkedList<Integer> listInt = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 8; i++) {
            int num = scanner.nextInt();
            listInt.add(num);
        }

        LinkedList<Integer> listIntEven = new LinkedList<>();
        LinkedList<Integer> listIntNotEven = new LinkedList<>();

        for (Integer integer : listInt) {
            if (integer % 2 == 0) {
                listIntEven.add(integer);
            } else {
                listIntNotEven.add(integer);
            }
        }

        System.out.println(listIntEven);
        System.out.println(listIntNotEven);
    }
}

/*
Создать список чисел и заполнить его с консоли
Разбить список на два других: - в первый список сохранять чётные числа - во второй список сохранять нечётные числа
Вывести содержимое всех списков в консоль. Каждый новый список выводить с новой строки, в ряд.
*/

