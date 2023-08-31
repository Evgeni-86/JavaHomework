package Leetcode.Medium;

import java.util.*;
import java.util.List;

public class ZigzagConversion {
    public static void main(String[] args) {
        String str = "PAYPALISHIRING";
//        PAHNAPLSIIGYIR
        System.out.println(test(str, 2));
    }

    public static String test(String s, int numRows) {

        if (numRows < 2){
            return s;
        }

        StringBuilder[] stringBuilders = new StringBuilder[numRows];
        int currentX = 0;
        int startY = numRows - 1;
        int previosX = currentX;

        for (int i = 0; i < s.length(); i++) {
            if (stringBuilders[startY] == null) {
                stringBuilders[startY] = new StringBuilder();
            }
            stringBuilders[startY].append(s.charAt(i));

            if (startY == 0 || previosX != currentX && startY < numRows - 1) {
                startY++;
                currentX++;
            } else {
                previosX = currentX;
                startY--;
            }
        }

        StringBuilder stringBuilder = new StringBuilder();
        for (StringBuilder builder : stringBuilders) {
            if (builder != null){
                stringBuilder.insert(0, builder);
            }
        }

        return stringBuilder.toString();
    }
}
