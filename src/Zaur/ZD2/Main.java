package Zaur.ZD2;

class Сalculations {
    final static double pi = 3.14;

    double areaСircle(int radius) {
        return pi * radius * radius;
    }

    void circleInfo(int radius) {
        System.out.println("Радиус круга: " + radius);
        System.out.println("Площадь круга: " + areaСircle(radius));
        System.out.println("Длина окружности: " + circumference(radius));
    }

    static int multiply(int a, int b, int c) {
        return a * b * c;
    }

    static void division(int a, int b) {
        System.out.println(a / b + " остаток " + a % b);
    }

    static double circumference(int radius) {
        return 2 * pi * radius;
    }
}

public class Main {
    public static void main(String[] args) {
        Сalculations.division(10, 3);
        Сalculations Circle1 = new Сalculations();
        Circle1.circleInfo(15);
    }

}
