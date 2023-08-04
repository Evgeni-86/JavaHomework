
package Leetcode;


import java.util.ArrayList;
import java.util.Collections;

public class L5MiddleOfTheArrayList {
    public static void main(String[] args) {
        Integer[] intArr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        ArrayList<Integer> listInt = new ArrayList<Integer>();
        Collections.addAll(listInt, intArr);

        int middleIndex = listInt.size() / 2;
        for (int i = 0; i < middleIndex; i++) {
            listInt.remove(0);
        }

        for (Integer elem : listInt) {
            System.out.println(elem);
        }
    }
}
