//Напишите программу на Java, чтобы получить большее
// значение между первым и последним элементом массива (длина 3) целых чисел.

package Kodesource;

public class T80 {
    public static void main(String[] args) {
        int[] arr = {20, 30, 40, 60, 10, 50};
        System.out.println(getMaxInRange(arr, 1, 4));
    }

    static int getMaxInRange(int[] arr, int start, int end) {
        int max = 0;

        for (int i = start; i <= end; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }
}
