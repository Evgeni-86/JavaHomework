/*
Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
Output: [1,2,2,3,5,6]
Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
*/

import java.util.*;


public class MergeSortedArray_88 {
    public static void main(String[] args) {
        int[] arr1 = {-1, 1, 4, 6};
        int[] arr2 = {0, 2, 5};
        merge(arr1, 2, arr2, 2);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        List<Integer> result = new ArrayList<>();

        int index_arr_one = 0;
        int index_arr_two = 0;

        while (index_arr_one < nums1.length || index_arr_two < nums2.length) {

            int num_left = 0;
            int num_right = 0;
            if (index_arr_one < nums1.length) {
                num_left = nums1[index_arr_one];
            }
            if (index_arr_two < nums2.length) {
                num_right = nums2[index_arr_two];
            }
            System.out.println("num_left " + num_left + " num_right " + num_right);

            if (num_left <= num_right && index_arr_one < nums1.length || index_arr_two == nums2.length) {
                result.add(num_left);
                index_arr_one++;
            } else if (index_arr_two < nums2.length) {
                result.add(num_right);
                index_arr_two++;
            }

            System.out.println(result);
        }
    }
}
