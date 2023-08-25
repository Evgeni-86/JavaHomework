package Leetcode.Medium;


public class LongestPalindromicSubstring {

    public static void main(String[] args) {
        String s = "cbbd";
        System.out.println(test(s));
    }

    public static String test(String s) {

        String out = "";
        for (int i = 0; i < s.length(); i++) {

            for (int j = i; j < s.length(); j++) {
                if (check(s, i, j)) {
                    System.out.println(i + " : " + j);
                    System.out.println("palindrom : " + (s.substring(i, j + 1)));
                    if ((s.substring(i, j + 1)).length() > out.length()) {
                        out = s.substring(i, j + 1);
                    }
                }
            }
        }
        return out;
    }


    public static boolean check(String s, int start, int end) {

        int center = start + (end - start) / 2;
        int leftPointer = center;
        int rightPointer = center;

        if ((end - start) % 2 != 0) {
            rightPointer = center + 1;
        }

        while (s.charAt(leftPointer) == s.charAt(rightPointer) && leftPointer >= start) {
            if (leftPointer == start && rightPointer == end) {
                return true;
            }
            leftPointer--;
            rightPointer++;
        }
        return false;
    }
}

