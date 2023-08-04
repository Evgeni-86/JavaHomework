//Напишите Java-программу для создания нового массива длиной 2
// из двух массивов целых чисел с тремя элементами, и новый
// массив будет содержать первый и последний элементы из двух массивов.


package Kodesource;

import java.util.Arrays;

public class T77 {
    public static void main(String[] args) {
        int[] arr1 = {50, -20, 0};
        int[] arr2 = {5, -50, 10};
        int[] arr3 = {50, -20, 0};
        int[] arr4 = {5, -50, 10};

        String str1 = "aaaaaaaaaa";
        String str2 = "aaaaaaa";

        System.out.println(Arrays.toString(getArr(arr1, arr2)));
        getArr2(arr1, arr2, arr3, arr4);
    }

    static int[] getArr(int[] arr1, int[] arr2) {
        int[] out = new int[2];
        out[0] = arr1[0];
        out[1] = arr2[arr2.length - 1];
        return out;
    }

    static void getArr2(int[]... args) {
        int[] outArr = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            int[] currenArr = args[i];
            if (i % 2 == 0) {
                outArr[i] = currenArr[0];
            } else {
                outArr[i] = currenArr[currenArr.length - 1];
            }
        }
        System.out.println(Arrays.toString(outArr));
    }
}
