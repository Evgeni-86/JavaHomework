/*
Напишите Java-программу для удаления n-го элемента из конца данного списка.

Пример вывода:

Исходный узел:
1 2 3 4 5
После удаления 2-го элемента с конца:
1 2 3 5
*/

package Kodesource;

import java.util.ArrayList;
import java.util.List;

public class T145 {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);

        System.out.println(test(nums));
    }

    public static List<Integer> test(List<Integer> nums) {
        nums.remove(nums.size() - 2);
        return nums;
    }
}
