package Leetcode.Easy;//69. Sqrt(x)

public class Sqrt_69 {
    public static void main(String[] args) {
        int integer = 2147395599;
        System.out.println(mySqrt(integer));
    }

    public static int mySqrt(int x) {
        long start = 0;
        long end = x;

        while (start + 1 < end) {
            long testNumber = start + ((end - start) / 2);
            System.out.println("start = " + start + " end = " + end);
            System.out.println("testNumber = " + testNumber);
            if (testNumber * testNumber <= x && (testNumber + 1) * (testNumber + 1) > x ) {
                System.out.println("result testNumber = " + testNumber);
                return (int) testNumber;
            }
            if (testNumber * testNumber > x) {
                end = testNumber;
            } else {
                start = testNumber;
            }
        }
        return x;
    }
}