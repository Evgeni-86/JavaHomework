/*
Напишите программу на Java для добавления двух чисел
 без использования арифметических операторов
 x = 10 y = 12 => результат 22
*/

package Kodesource;

public class T111 {
    public static void main(String[] args) {
        int x = 10;
        int y = 12;
        int z = Math.addExact(x,y);
        System.out.println(z);
    }

}
