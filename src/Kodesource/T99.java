//Напишите программу на Java, чтобы проверить, присутствует
// ли указанное число в каждой паре смежных элементов
// данного массива целых чисел.

package Kodesource;

public class T99 {
    public static void main(String[] args) {
        int[] intArr = {2, 20, 20, 11, 1, 45, 20, 2, 20, 20, 2, 2, 20, 21};
        System.out.println(check(intArr));
    }

    static boolean check(int[] arrInt) {
        boolean rez = false;

        for (int i = 1; i < arrInt.length; i++) {

            if (arrInt[i] == arrInt[i - 1]) {

                if (arrInt[i] == 20) {
                    rez = true;
                } else {
                    rez = false;
                    break;
                }

            }

        }
        return rez;
    }

}
