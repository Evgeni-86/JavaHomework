package Kodesource;

public class T50 {
    public static void main(String[] args) {
        int num1 = 3;
        int num2 = 5;

        for (int i = 1; i < 100; i++) {
            if (i % num1 == 0) {
                System.out.print(i + ", ");
            }
        }
        System.out.println();
        System.out.println("-------------------------");
        for (int i = 1; i < 100; i++) {
            if (i % num2 == 0) {
                System.out.print(i + ", ");
            }
        }
        System.out.println();
        System.out.println("-------------------------");
        for (int i = 1; i < 100; i++) {
            if (i % num1 == 0 && i % num2 == 0) {
                System.out.print(i + ", ");
            }
        }
    }
}
