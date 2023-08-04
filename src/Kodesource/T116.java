/*
Напишите программу на Java, которая перебирает целые
 числа от 1 до 100. Для кратных трех выведите «Fizz»
 вместо числа и напечатайте «Buzz» для кратных пяти.
 Когда число делится на три и пять, выведите «fizz buzz».
*/

package Kodesource;

public class T116 {
    public static void main(String[] args) {
        test();
    }

    static public void test() {
        for (int i = 0; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("Fizz Buzz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            }
        }
    }
}
