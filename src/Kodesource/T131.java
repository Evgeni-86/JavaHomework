/*
Напишите программу на Java, чтобы найти новую длину заданного отсортированного массива,
 в котором каждый элемент появляется только один раз (удалите дубликаты).
Исходный массив: [1, 1, 2, 3, 3, 3, 4, 5, 6, 7, 7]
 Длина исходного массива: 11. После удаления дубликатов новая длина массива: 7
*/

package Kodesource;

import java.util.Arrays;
import java.util.HashSet;

public class T131 {

    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 3, 3, 3, 4, 5, 6, 7, 7};
        System.out.println(Arrays.toString(test2(nums)));
    }


    static public int[] test2(int[] nums) {

        int currentPos = 0;

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] != nums[currentPos]) {
                nums[currentPos + 1] = nums[i];
                currentPos++;
            }

        }
        System.out.println(currentPos + 1);
        return nums;
    }


    static public int test(int[] nums) {
        HashSet<Integer> integers = new HashSet<>();
        for (int num : nums) {
            integers.add(num);
        }
        return integers.size();
    }
}
