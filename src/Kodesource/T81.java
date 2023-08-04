//Напишите программу на Java, чтобы поменять местами
// первый и последний элементы массива (длина должна быть не менее 1)
// и создать новый массив.

package Kodesource;

import java.util.Arrays;

public class T81 {
    public static void main(String[] args) {
        int[] arr = {20, 30, 40};
        System.out.println(Arrays.toString(changeTwoElem(arr)));
    }

    static int[] changeTwoElem(int[] arr) {
        int elem = arr[0];
        arr[0] = arr[arr.length-1];
        arr[arr.length-1] = elem;
        return arr;

//        int[] out = Arrays.copyOf(arr,arr.length);
//        out[0] = arr[arr.length -1];
//        out[out.length-1] = arr[0];
//        return out;
    }
}
