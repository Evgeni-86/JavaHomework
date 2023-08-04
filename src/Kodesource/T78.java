//Напишите программу на Java, чтобы проверить,
// что данный массив целых чисел длины 2 содержит 4 или 7

package Kodesource;

public class T78 {
    public static void main(String[] args) {
        int[] arr = {5, 7};
        System.out.println(checkArr(arr, 4, 7));
    }

    static boolean checkArr(int[] arr, int num1, int num2) {
        for (int elem : arr) {
            if (elem == num1 || elem == num2) {
                return true;
            }
        }
        return false;
    }
}
