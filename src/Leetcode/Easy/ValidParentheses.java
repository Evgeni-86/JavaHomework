package Leetcode.Easy;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ValidParentheses {

    public static void main(String[] args) {
        String str = "[()[]{[]}]";
//        String str = "(]";
//        String str = "([)]";
        System.out.println(check2(str));
    }


    public static boolean check2(String s) {

        List<Character> arrOpen = Arrays.asList('[', '(', '{');
        List<Character> arrClose = Arrays.asList(']', ')', '}');
        int[] arrCheck = {0, 0, 0};
        LinkedList<Integer> openIndexTemp = new LinkedList<>();

        for (int i = 0; i < s.length(); i++) {
            char currenChar = s.charAt(i);
            int index;
            if ((index = arrOpen.indexOf(currenChar)) != -1) {
                arrCheck[index]++;
                openIndexTemp.addFirst(index);
            } else if ((index = arrClose.indexOf(currenChar)) != -1) {
                arrCheck[index]--;
                if (arrCheck[index] < 0 || index != openIndexTemp.removeFirst()){
                    return false;
                }
            }
        }

        return Arrays.stream(arrCheck).sum() == 0;

    }

}
