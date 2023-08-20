/*
Напишите программу на Java, чтобы получить индекс первого числа и
 последнего числа подмассива, где сумма чисел равна нулю из
 заданного массива целых чисел. Перейти к редактору

Исходный массив: [1, 2, 3, -6, 5, 4]
Индекс подмассива указанного массива, где сумма чисел равна нулю: [0, 3]
*/

package Kodesource;

import java.util.Arrays;
import java.util.HashMap;

public class T139 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 6, -6, 5, 4};
        System.out.println(Arrays.toString(test(arr)));
    }

    public static int[] test(int[] numbers) {

        int[] rezultat = new int[2];
        int sum = 0;

        HashMap<Integer, Integer> sums = new HashMap<>();
        sums.put(0, -1);

        for (int i = 0; i < numbers.length; i++) {

            sum += numbers[i];

            if (sums.containsKey(sum)) {
                rezultat[0] = sums.get(sum) + 1;
                rezultat[1] = i;
            } else {
                sums.put(sum, i);
            }

        }

        return rezultat;
    }
}
