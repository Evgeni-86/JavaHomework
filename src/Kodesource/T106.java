/*
Напишите программу на Java для создания нового массива,
 смещенного влево от заданного массива целых чисел.
*/

package Kodesource;

public class T106 {
    public static void main(String[] args) {
        int[] intArr = {20, 23, 21, 11, 1, 45, 10};
        for (int elem:test(intArr)       ) {
            System.out.print(elem + " ");
        }
    }

    static int[] test(int[] arr){

        for (int i = 1; i< arr.length;i++) {
            int temp = arr[i - 1];
            arr[i-1] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }
}
