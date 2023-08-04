//Напишите программу на Java, чтобы проверить,
// является ли 10 первым или последним элементом
// массива целых чисел. Длина массива должна
// быть больше или равна 2.

package Kodesource;

import java.util.Arrays;

public class T74 {
    public static void main(String[] args) {
        int[] arrInt = {10, 12, 54, 98, 10, 78, 45, 10};
        checkElem(arrInt);
    }

    static void checkElem(int[] arr) {
        System.out.println(arr[0] == 10 || arr[arr.length - 1] == 10);
        if (arr[0] == 10) {
            System.out.println("10 первый элемент массива");
        }
        if (arr[arr.length - 1] == 10) {
            System.out.println("10 последний элемент массива");
        }
    }
}
