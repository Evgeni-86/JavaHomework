package javaRash;

import java.util.*;


public class Solution {
    public static void main(String[] args) {
        int number = 3;
        int[] arr = new int[number + 1];
        arr[0] = 1;
        arr[1] = 2;
        for (int i = 2; i <= number; i++) {
            arr[i] = arr[i - 2] + arr[i - 1];
        }
        System.out.println(Arrays.toString(arr));
    }
}
