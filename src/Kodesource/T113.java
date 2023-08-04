/*
Напишите программу на Java для
 объединения двух заданных отсортированных массивов
 целых чисел и создания нового отсортированного массива.

массив1 = [1,2,3,4]
массив2 = [2,5,7,8]
результат = [1,2,2,3,4,5,7,8]
*/

package Kodesource;

public class T113 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {2, 5, 7, 8};

        for (int elem : test(arr1, arr2)) {
            System.out.print(elem + " ");
        }
    }

//    static int[] test(int[] arr1, int[] arr2) {
//        int[] outArr = new int[arr1.length + arr2.length];
//        int counter = 0;
//        int outArrIndex = outArr.length - 1;
//        int index1arr = arr1.length - 1;
//        int index2arr = arr2.length - 1;
//        while (index2arr >= 0 && index1arr>=0) {
//            //если последний элемент первого больше последнего второго то пишем в конец нового и наоборот
//            if (arr1[index1arr] > arr2[index2arr]) {
//                outArr[outArrIndex--] = arr1[index1arr--];
//            } else {
//                outArr[outArrIndex--] = arr2[index2arr--];
//            }
//        }
//        while (index1arr>=0){
//            outArr[outArrIndex--] = arr1[index1arr--];
//        }
//        while (index2arr>=0){
//            outArr[outArrIndex--] = arr2[index2arr--];
//        }
//        return outArr;
//    }


    static int[] test(int[]... args) {
        int counter = 0;
        int size = 0;
        int indexOutArr = 0;
        for (int[] elem : args) {
            size += elem.length;
        }
        int[] outArr = new int[size];

        for (int[] currentArr : args) {
            for (int elem : currentArr) {
                outArr[indexOutArr++] = elem;
            }
        }

        for (int i = 0; i < outArr.length; i++) {
            for (int j = 1; j < outArr.length - i; j++) {
                if (outArr[j - 1] > outArr[j]) {
                    int temp = outArr[j - 1];
                    outArr[j - 1] = outArr[j];
                    outArr[j] = temp;
                }
            }
        }
        System.out.println(counter);
        return outArr;
    }
}
