/*
Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
I,V,X,L,C,D,M
Example 1:

Input: s = "III"
Output: 3
Explanation: III = 3.
Example 2:

Input: s = "LVIII"
Output: 58
Explanation: L = 50, V= 5, III = 3.
Example 3:

Input: s = "MCMXCIV"
Output: 1994
Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
*/

package Leetcode.Easy;

import java.util.HashMap;

public class RomanToInteger {
    public static void main(String[] args) {
        String s = "MCMXCIV";
//        String s = "III";
//        String s = "LVIII";
        System.out.println(test(s));
    }

    static public int test(String str) {
        HashMap<Character, Integer> base = new HashMap<>();
        base.put('I', 1);
        base.put('V', 5);
        base.put('X', 10);
        base.put('L', 50);
        base.put('C', 100);
        base.put('D', 500);
        base.put('M', 1000);

        int sum = 0;
        int prevNum = 0;

        for (int i = str.length() - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            int num = base.get(ch);

            if (num >= prevNum){
                sum = sum + num;
            } else {
                sum = sum - num;
            }

            prevNum = num;
        }
        return  sum;
    }
}









