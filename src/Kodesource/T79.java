//Напишите программу на Java, чтобы вращать массив (длина 3) целых чисел в левом направлении.

package Kodesource;

import java.util.Arrays;

public class T79 {
    public static void main(String[] args) {
        int[] arr = {20, 30, 40};
        System.out.println(Arrays.toString(arrReverse(arr)));
    }

    static int[] arrReverse(int[] arr) {
        int[] out = new int[arr.length];

        for (int i = 0; i < out.length; i++) {
            out[i] = arr[arr.length -1 - i];
        }

        return out;
    }
}
