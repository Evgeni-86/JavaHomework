//66. Plus One
import java.util.*;

public class PlusOne_66 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(plusOne(new int[]{0, 0, 0})));
    }

    public static int[] plusOne(int[] digits) {
        int ostatoc = 1;
        int maxValue = 9;

        for (int i = digits.length - 1; i >=0; i--) {

            if ((digits[i] + ostatoc) <= maxValue) {
                digits[i] += ostatoc; 
                return digits;
            } else {
                ostatoc -= (maxValue - digits[i]);
                digits[i] = 0;
            }

            if (i == 0) {
                digits = Arrays.copyOf(digits, digits.length + 1);
                i = 1;
            }
        }

        return digits;
    }
}