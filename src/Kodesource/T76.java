//Напишите программу на Java, чтобы проверить, совпадают ли
// первый и последний элемент двух массивов целых чисел.
// Длина массива должна быть больше или равна 2

package Kodesource;

public class T76 {
    public static void main(String[] args) {
        int[] arr1 = {50, -20, 0, 30, 40, 60, 12};
        int[] arr2 = {45, 20, 10, 20, 30, 50, 11};

        checkNumber(arr1, arr2);
    }

    static void checkNumber(int[] arr1, int[] arr2) {
        System.out.println(arr1[0] == arr2[0] && arr1[arr1.length - 1] == arr2[arr2.length - 1]);
    }
}
