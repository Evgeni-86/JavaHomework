package Algoritms.Recursion;

import java.util.LinkedList;

public class RecursuonSumInList {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(8);
        list.add(5);
        list.add(2);

        System.out.println(sum(list));
    }

    public static int sum(LinkedList<Integer> list){
        if (list.size() == 0){
            return 0;
        }

        int elem = list.pollFirst();

        return elem + sum(list);
    }
}


/*
sum({8,5,2})
sum({5,2})
sum({2})
sum(0)
*/
