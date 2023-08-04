//Напишите программу на Java, чтобы проверить, содержит ли указанный массив целых чисел 10 или 30

package Kodesource;

public class T102 {
    public static void main(String[] args) {
        int[] intArr = {2, 10, 10, 11, 1, 45, 20, 2, 20, 20, 2, 2, 20, 21};
        System.out.println(test(intArr));
    }

    static boolean test(int[] arr) {
        boolean rezult = false;
        for (int i = 0; i< arr.length; i++){
            if (arr[i] == 10) {
                rezult = true;
            }
            if (arr[i] == 30) {
                rezult = true;
            }
        }
        return rezult;
    }
}
