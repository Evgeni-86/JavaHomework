package Leetcode.Medium;

import java.util.*;
import java.util.List;

public class ZigzagConversion {
    public static void main(String[] args) {
        String str = "PAYPALISHIRING";
//        PAHNAPLSIIGYIR
        test(str, 3);
    }

    public static void test(String s, int numRows) {

        int startX = 0;
        int startY = numRows - 1;

        //coordinate y, index elem in string "s"
        TreeMap<Integer, ArrayList<Integer>> temp = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });

        for (int i = 0; i < s.length(); i++) {
            if (startY == 0) {
                while (startY < numRows - 1) {
                    addRows(startY, i, temp);
                    startY++;
                    startX++;
                    i++;
                }
                i--;
                continue;
            }
            addRows(startY--, i, temp);
        }

        System.out.println(temp);

        StringBuilder stringBuilder = new StringBuilder();

    }

    private static void addRows(int startY, int index, TreeMap<Integer, ArrayList<Integer>> temp) {
        ArrayList<Integer> indexs = temp.get(startY);
        if (indexs != null) {
            indexs.add(index);
            return;
        }
        temp.put(startY, new ArrayList<Integer>(List.of(index)));
    }
}
