package Leetcode.Easy;

import java.util.Arrays;

public class MergeSortedArray2 {
    public static void main(String[] args) {
        int[] arrOne = {1, 2, 3, 0, 0, 0};
        int[] arrTwo = {2, 5, 6};

        int labelArrOne = 0;
        int labelArrTwo = 0;

        while (labelArrOne < arrOne.length) {

            if (arrOne[labelArrOne] == 0){
                arrOne[labelArrOne] = arrTwo[labelArrTwo];
                labelArrTwo++;
                labelArrOne++;
                continue;
            }

            if (arrTwo[labelArrTwo] < arrOne[labelArrOne]) {
                int temp = arrOne[labelArrOne];
                arrOne[labelArrOne] = arrTwo[labelArrTwo];
                arrTwo[labelArrTwo] = temp;
            }
            labelArrOne++;
        }
        System.out.println(Arrays.toString(arrOne));
        System.out.println(Arrays.toString(arrTwo));
    }
}
