package Sber.Dz1path3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Z11 {

    public static void main(String[] args) {
        String str = "[()[]{[]}]";
//        String str = "(]";
//        String str = "([)]";
        System.out.println(check2(str));
    }

    public static boolean check(String str) {

        int counter1 = 0;
        int counter2 = 0;

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (currentChar == '(') {
                counter1++;
            } else if (currentChar == ')') {
                counter2++;
            }
            if (counter1 < counter2) {
                return false;
            }
        }

        return counter1 == counter2;

    }

    public static boolean check2(String s) {

        String open = "[{(";
        String close = "]})";
        int[] arrCheck = {0, 0, 0};
        LinkedList<Integer> openIndexTemp = new LinkedList<>();

        for (int i = 0; i < s.length(); i++) {
            char currenChar = s.charAt(i);
            int index;

            if ((index = open.indexOf(currenChar)) != -1) {
                arrCheck[index]++;
                openIndexTemp.addFirst(index);
            } else if ((index = close.indexOf(currenChar)) != -1) {
                arrCheck[index]--;
                if (arrCheck[index] < 0 || index != openIndexTemp.removeFirst()) {
                    return false;
                }
            }

        }

        return Arrays.stream(arrCheck).sum() == 0;

    }


}
