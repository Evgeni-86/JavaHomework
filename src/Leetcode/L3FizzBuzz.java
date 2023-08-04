//Напишите программу, которая выводит на экран числа от 1 до 100.
// При этом вместо чисел, кратных трем, программа должна выводить слово «Fizz»,
// а вместо чисел, кратных пяти — слово «Buzz». Если число кратно
// и 3, и 5, то программа должна выводить слово «FizzBuzz».

package Leetcode;

public class L3FizzBuzz {
    public static void main(String[] args) {
        checkOut(100);
    }


    static void checkOut(int max) {

        int start = 1;
        while (max > start) {
            if (start % 3 == 0) {
                System.out.println("Fizz" + " " + start);
            }
            if (start % 5 == 0) {
                System.out.println("Buzz" + " " + start);
            }
            if (start % 3 == 0 && start % 5 == 0) {
                System.out.println("FizzBuzz" + " " + start);
            }
            start++;
        }
    }
}
