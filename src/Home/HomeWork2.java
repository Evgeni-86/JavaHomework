package Home;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeWork2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str1 = reader.readLine();
        String str2 = reader.readLine();
        String str3 = reader.readLine();
        int num1 = Integer.parseInt(str1);
        int num2 = Integer.parseInt(str2);
        int num3 = Integer.parseInt(str3);

        if (num1 < num2 && num1 < num3 ) {
            System.out.println(num1);
        } else if (num2 < num3) {
            System.out.println(num2);
        } else {
            System.out.println(num3);
        }

        str1 = reader.readLine();
        num1 = Integer.parseInt(str1);
        compare(num1);

        str1 = reader.readLine();
        num1 = Integer.parseInt(str1);
        int rez1 = check1(num1);
        System.out.println(rez1);

        str1 = reader.readLine();
        num1 = Integer.parseInt(str1);
        checkInterval(num1);

        str1 = reader.readLine();
        str2 = reader.readLine();
        num1 = Integer.parseInt(str1);
        num2 = Integer.parseInt(str2);
        rez1 = closeToFive(num1, num2);
        System.out.println("Близкое число к 5 "+rez1);
    }

    public static void compare(int number) {
        if (number == 5) {
            System.out.println("Число равно 5");
        }
        if (number > 5) {
            System.out.println("Число больше 5");
        }
        if (number < 5) {
            System.out.println("Число меньше 5");
        }
    }

    public static int check1(int number) {
        if (number >= 0) {
            return (number * 2);
        } else {
            return (number + 10);
        }
    }

    public static void checkInterval(int a) {
        if (a >= 20 && a <= 50) {
            System.out.println("Число а содержиться в интервале");
        } else {
            System.out.println("Число а не содержиться в интервале");
        }
    }

    public static int closeToFive(int number1, int number2) {
        int a = 5;
        int b;
        int c;
        if (number1 >= a) {
            b = number1 - a;
        } else {
            b = a - number1;
        }
        if (number2 >= a) {
            c = number2 - a;
        } else {
            c = a - number2;
        }
        if (b <= c) {
            return number1;
        } else {
            return number2;
        }
    }

}
