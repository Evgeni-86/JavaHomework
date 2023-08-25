package algoritms.Recursion;


import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
        System.out.println(binary(numbers, 10));
    }

    public static int binary(int[] inArr, int num) {
        int medium = (inArr.length - 1) / 2;
        if (inArr.length == 0) {
            return 0;
        }
        if (inArr[medium] == num) {
            return inArr[medium];
        }

//        System.out.println("start " + inArr[0] + " end " + inArr[inArr.length - 1] + " medium index " + medium + " medNum " + inArr[medium]);
        int[] newArr;

        if (num > inArr[medium]) {
            newArr = Arrays.copyOfRange(inArr, medium + 1, inArr.length);
        } else {
            newArr = Arrays.copyOfRange(inArr, 0, medium);
        }

        return binary(newArr, num);
    }
}
