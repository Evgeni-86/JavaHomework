/*
Напишите программу на Java, чтобы найти новую длину заданного отсортированного
 массива, в котором дублирующиеся элементы появлялись не более двух раз. Перейти к редактору
Исходный массив: [1, 1, 2, 3, 3, 3, 4, 5, 6, 7, 7, 7, 7]
*/


package Kodesource;

import java.util.Arrays;

public class T132 {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 3, 3, 3, 4, 5, 6, 7, 7, 7, 7};
        System.out.println(test(nums));
    }

    static public int test(int[] nums) {

        int counter = 0;
        int similar = 0;

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] != nums[counter]){
                nums[counter + 1] = nums[i];
                similar = 0;
                counter++;
            } else if (similar == 0){
                nums[counter + 1] = nums[i];
                similar = 1;
                counter++;
            }

        }

        System.out.println(Arrays.toString(nums));

        return counter + 1;
    }
}
