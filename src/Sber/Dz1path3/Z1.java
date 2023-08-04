package Sber.Dz1path3;
//Сбер ДЗ1 Часть 3 №4
import java.util.Scanner;

public class Z1 {
    public static void main(String[] args) {
        //Решение 1
        for (int i = 1; i <= 9; i++) {
            int counter = 1;
            while (counter <= 9) {
                System.out.println(i +" x "+ counter + " = " + (i * counter++));
            }
            System.out.println("------------");
        }
        System.out.println("-----------------------------------------");
        //-----------------------------------------------------------------------
        //Решение 2
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                int rezult = i * j;
                //если результат 1 символ
                if (rezult <= 9) {
                    //если он в начале новой строки
                    if (j == 1) {
                        System.out.printf(String.valueOf(" " + rezult));
                    } else {
                    //если не вначале
                        System.out.printf(String.valueOf("   " + rezult));
                    }
                } else {
                //если результат 2 символа
                    //если он в начале новой строки
                    if (j == 1) {
                        System.out.printf(String.valueOf(rezult));
                    } else {
                    //если не начало новой строки
                        System.out.printf(String.valueOf("  " + rezult));
                    }
                }
            }
            System.out.println();
        }
    }
}
