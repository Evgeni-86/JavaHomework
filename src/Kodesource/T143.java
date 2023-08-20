//Напишите программу на Java для объединения двух заданных отсортированных списков.
//Пример вывода:
//Объединить два отсортированных списка T:
//1 2 3 7 9 13 40

package Kodesource;

import java.util.*;

public class T143 {
    public static void main(String[] args) {
        LinkedList<Integer> integers1 = new LinkedList<>();
        integers1.add(-1);
        integers1.add(0);
        integers1.add(4);
        integers1.add(8);
        integers1.add(12);
        integers1.add(19);

        LinkedList<Integer> integers2 = new LinkedList<>();
        integers2.add(0);
        integers2.add(5);
        integers2.add(8);
//        integers2.add(15);
//        integers2.add(20);

        System.out.println(test(integers1, integers2));
    }

    public static List<Integer> test(LinkedList<Integer> list1, LinkedList<Integer> list2) {

        Iterator<Integer> iteratorList1 = list1.iterator();
        Iterator<Integer> iteratorList2 = list2.iterator();

        LinkedList<Integer> out = new LinkedList<>();

        Integer elementList1Memory = null;//0 - ЗНАЧИТ ДОСТУПЕН ДЛЯ ЗАПИСИ
        Integer elementList2Memory = null;

        while (out.size() < list1.size() + list2.size()) {

            if (elementList1Memory == null && iteratorList1.hasNext()) {
                elementList1Memory = iteratorList1.next();
            }

            if (elementList2Memory == null && iteratorList2.hasNext()) {
                elementList2Memory = iteratorList2.next();
            }

//            System.out.println(elementList1Memory + " : " + elementList2Memory);
            if (elementList1Memory == null || elementList2Memory != null && elementList1Memory > elementList2Memory) {
                out.addLast(elementList2Memory);
                elementList2Memory = null;
            } else {
                out.addLast(elementList1Memory);
                elementList1Memory = null;
            }
//            System.out.println(out);
        }
        return out;
    }
}

