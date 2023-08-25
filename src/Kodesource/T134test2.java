package Kodesource;

import java.util.ArrayList;
import java.util.LinkedList;

public class T134test2 {
    public static void main(String[] args) {
        test(0, 5);
    }

    public static void test(int start, int target) {
        LinkedList<ArrayList<Integer>> stack = new LinkedList<>();
        ArrayList<Integer> startPoint = new ArrayList<>();
        stack.add(startPoint);

        int[] stepsVariants = {1, 2};

        while (stack.size() > 0) {
            ArrayList<Integer> currentArr = stack.removeFirst();
            int sum = 0;
            for (Integer integer : currentArr) {
                sum += integer;
            }
            if (sum == (target - start)) {
                System.out.println(currentArr);
            } else if (sum < target) {

                for (int i = stepsVariants.length - 1; i >= 0; i--) {
                    ArrayList<Integer> newArr = new ArrayList<>(currentArr);
                    newArr.add(stepsVariants[i]);
                    stack.addFirst(newArr);
                }
            }
        }
    }

}
