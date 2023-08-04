/*
Напишите Java-программу для создания нового массива
 из заданного массива целых чисел, новый массив будет
 содержать элементы из данного массива после последнего
 значения элемента 10
*/

package Kodesource;

public class T103 {
    public static void main(String[] args) {
        int[] intArr = {2, 10, 19, 11, 1, 45, 10, 2, 20, 20, 2, 2, 20, 21};

        for (int elem : test(intArr)) {
            System.out.print(elem + " ");
        }
    }

    static int[] test(int[] arr) {
        int lastIndex = arr.length - 1;

        while (arr[lastIndex] != 10) {
            lastIndex--;
        }
        lastIndex++;
        int[] outArr = new int[arr.length - lastIndex];

        for (int i = 0; i < outArr.length; i++) {
            outArr[i] = arr[lastIndex++];
        }

        return outArr;
    }
}
