/*
Напишите программу на Java, чтобы проверить,
содержит ли массив целых трех возрастающих смежных чисел.
*/

package Kodesource;

public class T107 {
    public static void main(String[] args) {
        int[] intArr = {20, 14, 15, 16, 1, 45, 10};
        System.out.println(test(intArr));
    }

    static boolean test(int[] arr) {
        int counter = 0;
        for (int i = 1; i < arr.length; i++) {
            if (counter == 3) {
                return true;
            }
            if (arr[i] > arr[i - 1]) {
                counter++;
            }
        }
        return false;
    }
}
