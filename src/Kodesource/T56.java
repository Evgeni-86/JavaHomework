package Kodesource;

//Напишите программу на Java, чтобы найти число целых чисел в диапазоне двух указанных чисел,
// которые делятся на другое число. Перейти к редактору
//Например, x = 5, y = 20 и p = 3, найдите количество целых чисел в диапазоне x..y,
// которые делятся на p, т. Е. {I: x ≤ i ≤ y, i mod p = 0}
public class T56 {
    public static void main(String[] args) {
        int num = 5;
        int num2 = 20;
        int num3 = 3;
        int counter = 0;

        for (int i = num; i <= num2; i++) {
            if (i%num3 == 0) {
                counter++;
            }
        }

        System.out.println(counter);
    }
}
