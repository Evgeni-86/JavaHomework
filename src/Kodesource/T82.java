//Напишите программу на Java, чтобы найти самый большой
// элемент между первым, последним и средним значениями
// из массива целых чисел (четной длины).

package Kodesource;


public class T82 {
    public static void main(String[] args) {
        int[] arr = {20, 30, 40, 50, 67, 20, 30, 40, 99};
        System.out.println(getMax(arr));
    }

    static int getMax(int[] arr) {
        int max = 0;

        for (int i = 0; i < arr.length; i += arr.length / 2) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }
}

