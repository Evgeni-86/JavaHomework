//Напишите программу на Java для подсчета количества
// четных и нечетных элементов в данном массиве целых чисел.

package Kodesource;

public class T92 {
    public static void main(String[] args) {
        int[] intArr = {12, 3, 45, 1, 98, 32, 45, 5, 9, 18, 31, 45, 88, 44};
        int[] rez = test(intArr);
        System.out.println("Even numbers: "+ rez[0]);
        System.out.println("Odd numbers: "+ rez[1]);
    }

    static int[] test(int[] arrInt) {
        int even = 0;
        int odd = 0;

        for (int elem : arrInt) {
            if (elem % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        int[] data = {even, odd};
        return data;
    }
}
