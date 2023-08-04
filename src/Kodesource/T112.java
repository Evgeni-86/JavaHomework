/* Напишите Java-программу для вычисления числа конечных нулей в факториале.
7! = 5040, поэтому на выходе должно быть 1

n!= 1 * … * (n-2) * (n-1) * n, т. е. каждый предыдущий множитель меньше на единицу, чем последующий.
*/

package Kodesource;

public class T112 {

    public static void main(String[] args) {
        int input = 7;
        System.out.println(test(input));
    }

    static int test(int input) {

        if (input == 1) {
            return input;
        } else {
            input = test(input - 1) * input;
            return input;
        }

    }
}
