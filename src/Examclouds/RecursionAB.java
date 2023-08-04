//Даны два целых числа A и В. Выведите все числа от A до B включительно,
// в порядке возрастания, если A < B, или в порядке убывания в
// противном случае. Использовать рекурсию.

package Examclouds;

public class RecursionAB {

    public static void func(int a, int b) {
        if (a == b) {
            System.out.println(a);
        } else if (a < b) {
            System.out.println(a);
            func(++a, b);
        } else {
            System.out.println(a);
            func(--a, b);
        }
    }

}

class TestRecursionAB {
    public static void main(String[] args) {
        RecursionAB.func(5, 10);
        RecursionAB.func(10, 5);
    }
}