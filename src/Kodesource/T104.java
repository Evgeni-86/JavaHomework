/*
Напишите Java-программу для создания нового массива
 из заданного массива целых чисел, новый массив будет
 содержать элементы из данного массива до значения
 последнего элемента 10.
*/

package Kodesource;

public class T104 {
    public static void main(String[] args) {
        int[] intArr = {2, 10, 19, 11, 1, 45, 10, 2, 20, 20, 2, 2, 20, 21};
        for (int elem : test(intArr)) {
            System.out.print(elem + " ");
        }
    }

    static int[] test(int[] arr) {
        int[] outArr = new int[0];

        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == 10) {
                i++;
                outArr = new int[arr.length - i];

                for (int j = 0; j < outArr.length; j++) {
                    outArr[j] = arr[i++];
                }

                break;
            }
        }
        return outArr;
    }
}
