//Напишите программу на Java для вычисления квадратного корня заданного целого числа.

package Kodesource;

public class T117 {
    public static void main(String[] args) {
        int i = 9;
        System.out.println(test(i));
    }

    static public int test(int number) {

        int a = 0;
        int b = number;

        int mid = (a + b) / 2;

        while (b > a) {

            if (mid * mid == number) {
                return mid;
            }

            if (mid * mid > number) {
                b = mid;
            } else {
                if (number / mid <= mid) {
                    return mid;
                }
                a = mid;
            }

            mid = (a + b) / 2;
        }
        return mid;
    }
}
