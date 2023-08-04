//Напишите программу на Java, чтобы переставить все элементы
// заданного массива целых чисел так, чтобы все нечетные
// числа предшествовали всем четным числам.

package Kodesource;

public class T94 {
    public static void main(String[] args) {
        int[] intArr = {12, 3, 45, 10, 10, 32, 45, 5, 9, 20, 21, 45, 88, 44};
        for (int elem : sort(intArr)) {
            System.out.println(elem);
        }
    }

    static int[] sort(int[] arr) {

        int start = 0;
        for (int i = start + 1; i< arr.length; i++) {
            System.out.println("счетчик " +i);
            if (arr[i] % 2 != 0) {
                int temp = arr[i];
                arr[i] = arr[start];
                arr[start] = temp;
                start++;
            }

        }



//------------------------------------------------------------
//        int start = 0;
//        int end = arr.length - 1;
//        while (start != end) {
//            System.out.println("проверяем " + arr[start]);
//
//            if (arr[start] % 2 == 0) {
//                System.out.println(arr[start] + " четное");
//                int cur = arr[start];
//                arr[start] = arr[end];
//                arr[end] = cur;
//                end--;
//            } else {
//                System.out.println(arr[start] + " не четное");
//                start++;
//            }
//
//        }
        return arr;
    }
}
