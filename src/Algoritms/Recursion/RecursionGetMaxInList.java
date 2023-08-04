package Algoritms.Recursion;

import java.util.LinkedList;

public class RecursionGetMaxInList {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(5);
        list.add(8);
        list.add(2);

        System.out.println(getMax(list));
    }

    static public int getMax(LinkedList<Integer> list) {

        if (list.size() == 0) {
            return 0;
        }

        int elem = list.pollFirst(); //2 на дне стека
        int elem2 = getMax(list);    //0 на дне стека

//        if (elem > elem2){
//            return elem;
//        } else {
//            return elem2;
//        }
        return Math.max(elem, elem2);

    }
}
