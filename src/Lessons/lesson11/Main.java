package Lessons.lesson11;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        int num = 12374;
//        test1(num);
        System.out.println();
//        test2(num);

        HashSet<Integer> people = new HashSet<>();

        people.add(5);
        people.add(2);
        people.add(7);

        HashSet<Integer> peClone = new HashSet<>(people);

        for (Integer person : peClone) {
            if (person % 2 != 0) {
                people.remove(person);
            }
        }

        System.out.println(people);

        List<Integer> integers = new ArrayList<>(List.of(4, 5, 9, 8, 3, 1));

//        for (int i = 0; i < integers.size(); i++) {
//            int elem = integers.get(i);
//
//            if (elem % 2 != 0) {
//                integers.remove(i);
//                i--;
//            }
//
//        }

        Iterator iterator  = integers.iterator();
        while (iterator.hasNext()){
            int elem = (int) iterator.next();
            if (elem % 2 != 0){
                System.out.println(elem);
                iterator.remove();
            }
        }

        System.out.println(integers);


    }

//    //вывести цифры слева направо
//    static public void test1(int num){
//        if (num == 0){
//            return;
//        }
//        test1(num / 10);
//        int n = num % 10;
//        System.out.print(n + " ");
//    }
//
//    static public void test2(int num){
//        if (num == 0){
//            return;
//        }
//        int n = num % 10;
//        System.out.print(n + " ");
//        test2(num / 10);
//    }
}

/*
12374
1237
123
12
1
*/
