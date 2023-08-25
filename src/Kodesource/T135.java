/*
Напишите Java-программу для удаления дубликатов из отсортированного связанного списка.
Исходный список с дублирующимися элементами:
12-> 12-> 13-> 14-> 15-> 15-> 16-> 17-> 17
После удаления дубликатов из указанного списка:
12-> 13-> 14-> 15-> 16-> 17
*/

package Kodesource;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class T135 {
    public static void main(String[] args) {
        LinkedList<Integer> integers = new LinkedList<>();
        integers.add(12);
        integers.add(12);
        integers.add(13);
        integers.add(14);
        integers.add(15);
        integers.add(15);
        integers.add(16);
        integers.add(17);
        integers.add(17);

        System.out.println(test(integers));
        System.out.println(test2(integers));
    }

    public static LinkedList<Integer> test(LinkedList<Integer> integers){
        LinkedHashSet<Integer> hashSet = new LinkedHashSet<>(integers);
        LinkedList<Integer> out = new LinkedList<>(hashSet);
        return out;
    }

    public static LinkedList<Integer> test2(LinkedList<Integer> integers){

        Iterator<Integer> iterator = integers.iterator();
        int lastNumber = 0;
        while (iterator.hasNext()){
            int currentInt = iterator.next();
            if (currentInt == lastNumber){
                iterator.remove();
            }
            lastNumber = currentInt;
        }
        return integers;
    }
}
