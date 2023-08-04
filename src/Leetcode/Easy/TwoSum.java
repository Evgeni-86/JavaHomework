/*
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
*/

package Leetcode.Easy;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        for (int elem : test(nums, 17)) {
            System.out.println(elem);
        }
    }

    static int[] test(int[] inputArr, int target) {
        for (int i = 0; i < inputArr.length; i++) {

            for (int j = i + 1; j < inputArr.length; j++) {

                    if (inputArr[i] + inputArr[j] == target) {
                        return new int[]{i, j};
                    }
            }
        }
        return null;
    }
}
