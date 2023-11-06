package Leetcode.Easy;

import java.util.Arrays;

public class MergeSortedArray_88 {
    public static void main(String[] args) {
        int[] arr1 = {4,5,6,0,0,0};
        int[] arr2 = {1,2,3};
        merge(arr1, 3, arr2, 3);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        int labelArrOne = m - 1;
        int labelArrTwo = n - 1;
        int labelMax = m + n - 1;

        while (labelArrOne >= 0 && labelArrTwo >= 0) {
            if (nums1[labelArrOne] > nums2[labelArrTwo]) {
                nums1[labelMax] = nums1[labelArrOne];
                labelArrOne--;
                labelMax--;
            }
            else {
                nums1[labelMax] = nums2[labelArrTwo];
                labelArrTwo--;
                labelMax--;
            }
        }

        while (labelArrOne >= 0 || labelArrTwo >= 0) {
            nums1[labelMax--] = (labelArrOne < 0) ? nums2[labelArrTwo--] : nums1[labelArrOne--];
        }

        System.out.println(Arrays.toString(nums1));
    }
}
