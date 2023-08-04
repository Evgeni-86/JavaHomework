/*
Напишите программу на Java, чтобы найти число, которое встречается
только один раз в данном массиве целых чисел, все числа встречаются дважды.
Source Array: [10, 20, 10, 20, 30, 40, 40, 30, 50] 50 появляется только один раз
*/

package Kodesource;

import java.util.HashSet;

public class T129 {
    public static void main(String[] args) {
        int[] nums = {10, 20, 10, 20, 30, 40, 40, 30, 50};

        for (Object o : test(nums)) {
            int cur = (int) o;
            System.out.println(cur);
        }

    }

    static public HashSet test(int[] intArr) {
        HashSet<Integer> hashSet = new HashSet<>();

        for (int i = 0; i < intArr.length; i++) {
            int cur = intArr[i];
            if (hashSet.contains(cur)){
                hashSet.remove(cur);
            } else {
                hashSet.add(cur);
            }
        }
        return hashSet;
    }
}
