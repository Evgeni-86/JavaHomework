package Leetcode.Easy;

public class PalindromeNumber {

    public static void main(String[] args) {
        int num = 101;
        System.out.println(test(num));
    }

    static public boolean test(int num) {
        StringBuilder sb = new StringBuilder(String.valueOf(num));
        return sb.reverse().toString().equalsIgnoreCase(String.valueOf(num));
    }
}
