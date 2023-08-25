/*
Напишите программу на Java, чтобы удалить все вхождения
 указанного значения в заданном массиве целых чисел и
 вернуть новую длину массива. Перейти к редактору

Пример вывода:
Исходный массив: [1, 4, 6, 7, 6, 2]
Длина нового массива: 4
*/

package Kodesource;

import java.util.HashSet;

public class T144 {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 4, 6, 7, 6, 2};
        int num = 6;
        System.out.println(getLength(nums, num));
    }

    public static  int getLength(int[] arr, int num){
        HashSet<Integer> integers = new HashSet<>();
        for (int j : arr) {
            if (j != num) {
                integers.add(j);
            }
        }
        return integers.size();
    }
}
