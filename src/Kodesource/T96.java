// Напишите программу на Java, чтобы проверить,
// есть ли 10 в данном массиве целых чисел
// с 20 где-то позже в массиве

package Kodesource;

import java.util.Arrays;

public class T96 {
    public static void main(String[] args) {
        int[] intArr = {12, 3, 45, 10, 32, 45, 5, 9, 20, 21, 45, 88, 44};
        System.out.println(checkArr(intArr));
    }

    static boolean checkArr(int[] arr) {

        boolean num1finde = false;
        for (int elem : arr) {
            if (elem == 10 && !num1finde) {
                num1finde = true;
            } else if (elem == 20 && num1finde) {
                return true;
            }
        }
        return false;
    }
}
