package DZ3;

import java.util.*;

public class Solution {
    public static void main(String[] args) {

        String value = "[({})]".repeat(200);

//        System.out.println(test1(value));
        System.out.println(test2(value));
//        System.out.println(test3(value));
    }

    public static boolean test1(String str) {
        Long startTime = System.nanoTime();

        int openCounter = 0;
        int closeCounter = 0;

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (currentChar == '(') {
                openCounter++;
            } else if (currentChar == ')') {
                closeCounter++;
            }
            if (closeCounter > openCounter) {
                return false;
            }
        }
        Long endTime = System.nanoTime();
        System.out.println(endTime - startTime);
        return openCounter == closeCounter;
    }

    public static boolean test2(String s2) {
        Long startTime = System.nanoTime();
        String open = "([{";
        String close = ")]}";
        Stack<Integer> openIndexes = new Stack<>();

        for (int i = 0; i < s2.length(); i++) {
            char currentChar = s2.charAt(i);
            if (currentChar == '(' || currentChar == '{' || currentChar == '[') {
                int index = open.indexOf(currentChar);
                openIndexes.push(index);
            } else if (currentChar == ')' || currentChar == '}' || currentChar == ']') {
                int index = close.indexOf(currentChar);
                if (openIndexes.size() == 0 || index != openIndexes.pop()) {
                    return false;
                }
            }
        }
        Long endTime = System.nanoTime();
        System.out.println(endTime - startTime);
        return openIndexes.size() == 0;
    }

    public static boolean test3(String s2) {
        Long startTime = System.nanoTime();
        String open = "([{";
        String close = ")]}";
        LinkedList<Integer> openIndexes = new LinkedList<>();

        for (int i = 0; i < s2.length(); i++) {
            char currentChar = s2.charAt(i);
            if (currentChar == '(' || currentChar == '{' || currentChar == '[') {
                int index = open.indexOf(currentChar);
                openIndexes.addFirst(index);
            } else if (currentChar == ')' || currentChar == '}' || currentChar == ']') {
                int index = close.indexOf(currentChar);
                if (openIndexes.size() == 0 || index != openIndexes.removeFirst()) {
                    return false;
                }
            }
        }
        Long endTime = System.nanoTime();
        System.out.println(endTime - startTime);
        return openIndexes.size() == 0;
    }

}
