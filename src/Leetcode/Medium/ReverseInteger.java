package Leetcode.Medium;


public class ReverseInteger {
    public static void main(String[] args) {
        int num = -1234567899;
        System.out.println(test(num));
    }

    public static int test(int x) {
        if (x > 2147483647 && x < -2147483648) {
            return 0;
        }
        String st = String.valueOf(x);
        StringBuilder sb = new StringBuilder();

        int endIndex = 0;
        for (int i = st.length() - 1; i >= endIndex; i--) {
            if (sb.length() == 0 && st.charAt(0) == '-') {
                sb.append(st.charAt(0));
                endIndex++;
            }
            sb.append(st.charAt(i));
        }

        try {
            return Integer.parseInt(sb.toString());
        } catch (NumberFormatException e) {
            return 0;
        }
    }
}
