/*
Напишите программу на Java, чтобы проверить,
 совпадают ли группы чисел (l) в начале и конце данного массива
*/

package Kodesource;

public class T105 {
    public static void main(String[] args) {
        int[] intArr = {20, 23, 21, 11, 1, 45, 10, 2, 20, 20, 2, 21, 20, 23};
        System.out.println(test(intArr));
    }

    static boolean test(int[] arr) {

        int number = 2;
        int equals = 0;

        for (int i = 0; i < number; i++) {

            for (int j = arr.length - number; j < arr.length; j++) {

                if (arr[i] == arr[j]) {

                    System.out.println("Number " + arr[i] + " " + arr[j]);
                    equals++;

                    if (i > 0 && arr[i] == arr[i - 1] && equals > 1) {
                        equals--;
                    }

                }

            }
        }
        System.out.println("equalsPair " + equals);
        return (equals == number);


//        boolean rezult = false;
//        int numbers = 2;
//        int start = 0;
//        int end = arr.length - numbers;
//
//        while (end < arr.length && arr[start] == arr[end] && arr.length > 1) {
//            start++;
//            end++;
//        }
//        if (start == numbers) {
//            rezult = true;
//        }
//        return rezult;

    }
}
