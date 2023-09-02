package Leetcode.Medium;


public class StringToIntegerAtoi {
    public static void main(String[] args) {
        String s = "__   - 4 2";
        System.out.println(test(s));
    }

    public static int test(String s) {

        StringBuilder sb = new StringBuilder();
        char prev = '+';

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                continue;
            }
            if (Character.isDigit(s.charAt(i))) {
                if (prev == '-') {
                    sb.append(prev);
                    prev = '+';
                }
                sb.append(s.charAt(i));
                prev = s.charAt(i);
                continue;
            }
            if (Character.isDigit(prev)) {
                break;
            }
            prev = s.charAt(i);
        }

        long res = Long.valueOf(sb.toString());
        if (res > Integer.MIN_VALUE && res < Integer.MAX_VALUE) {
            return (int) res;
        }
        return 0;
    }
}
