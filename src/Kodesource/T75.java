//Напишите программу на Java, чтобы проверить, совпадают
// ли первый и последний элемент массива целых чисел.
// Длина массива должна быть больше или равна 2. Перейти в редактор
//Данные испытаний: массив = 50, -20, 0, 30, 40, 60, 10

package Kodesource;

public class T75 {
    public static void main(String[] args) {
        int[] arrInt = {50, -20, 0, 30, 40, 60, 10};
        checkNumber(arrInt);
    }

    static void checkNumber(int[] arr) {
        System.out.println(arr[0] == arr[arr.length - 1]);
    }
}
