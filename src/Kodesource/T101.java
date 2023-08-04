/* Напишите программу на Java, чтобы проверить,
больше ли число 10, чем число до 20 в данном
массиве целых чисел. */

package Kodesource;

public class T101 {
    public static void main(String[] args) {
        int[] intArr = {2, 10, 10, 11, 1, 45, 20, 2, 20, 20, 2, 2, 20, 21};
        System.out.println(test(intArr));
    }

    static boolean test(int[] arr) {
        int num1 = 0;
        int num2 = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == 10) {
                num1++;
            }
            if (arr[i] == 20) {
                num2++;
            }

        }

        return num1 > num2;
    }
}
