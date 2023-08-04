package Kodesource;

import java.util.Scanner;

public class T17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long num1 = scanner.nextLong();
        long num2 = scanner.nextLong();
        int i = 0;
        int[] sum = new int[10];
        int memory = 0;

        while (num1 != 0 || num2 != 0) {//пока оба условия true выполняем
            //складываем крайнее правое число (получим 0 или 1)
            sum[i++] = (int)(num1 % 10 + num2 % 10 + memory) % 2;
            //если есть остаток (1) то запомним его
            memory = (int)(num1 % 10 + num2 % 10 + memory) / 2;
            //перезапишем переменные для следующего расчета без крайней правой цифры
            //long дает возможность отсечь все после запято~~й
            num1 = num1 / 10;
            num2 = num2 / 10;
        }
        //если в уме осталась еденица, то ставим ее в начало
        if (memory != 0) {
            sum[i++] = memory;
        }
        //вывод с последней записи вариант 1
//        System.out.println();
//        for (int j = i; j >= 0; j--) {
//            System.out.print(sum[j]);
//        }
        //вывод с последней записи вариант 2
        --i;
        while (i >= 0) {
            System.out.print(sum[i--]);
        }

    }
}
