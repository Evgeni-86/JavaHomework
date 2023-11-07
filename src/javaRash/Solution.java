package javaRash;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        String[] array = {"A", null, null, "C", null, "D", null};

        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                if (i == index) {
                    index++;
                    continue;
                }
                String temp = array[i];
                array[i] = array[index];
                array[index++] = temp;
            }
        }

        System.out.println(Arrays.toString(array));
    }
}
