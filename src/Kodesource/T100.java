/*
Напишите программу на Java для подсчета двух элементов,
 отличающихся на 1 или менее от двух заданных массивов
 целых чисел одинаковой длины.
*/

package Kodesource;

public class T100 {
    public static void main(String[] args) {
        int[] intArr1 = {22, 18, 20, 11, 1, 45, 20, 2, 22, 19, 2, 4, 8, 10};
        int[] intArr2 = {2, 20, 20, 11, 1, 44, 20, 2, 20, 20, 2, 2, 20, 21};
        System.out.println(test(intArr1, intArr2));
    }

    static int test(int[] arr1, int[] arr2) {
        int rezult = 0;

            for (int i = 0; i< arr1.length; i++) {
                int modul = Math.abs(arr1[i] - arr2[i]);
                if ( modul <= 1 && arr1[i] != arr2[i]) {
                    rezult++;
                }
            }

        return rezult;
    }
}
