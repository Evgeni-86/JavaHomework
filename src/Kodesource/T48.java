package Kodesource;

//Напишите программу на Java для печати нечетных чисел от 1 до 99. Печатает по одному числу в строке
public class T48 {
    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }

    }
}
