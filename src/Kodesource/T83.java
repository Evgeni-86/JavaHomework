//Напишите программу на Java, чтобы умножить
// соответствующие элементы двух массивов целых чисел.

package Kodesource;

import java.util.Arrays;

public class T83 {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, -5, 4};
        int[] arr2 = {1, 4, -5, -2};

        System.out.println(Arrays.toString(getNewArr(arr1, arr2)));
    }

    static int[] getNewArr(int[] arr1, int[] arr2) {
        int[] newArr = new int[(arr1.length + arr2.length) / 2];

        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = arr1[i] * arr2[i];
        }


        return newArr;
    }
}
