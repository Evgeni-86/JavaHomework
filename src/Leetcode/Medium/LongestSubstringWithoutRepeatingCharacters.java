/*
Дана строка s, найдите длину самой длинной
подстрока
без повторяющихся символов.

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
*/


package Leetcode.Medium;


public class LongestSubstringWithoutRepeatingCharacters {

    public static void main(String[] args) {

        String str = "pwwkew";
        System.out.println(test(str));
    }

    static public int test(String s) {
        StringBuilder temp = new StringBuilder();

        int rezult = 0;
        int counter = 0;
        int i = 0;

        while (i < s.length()) {

            for (int j = i; j < s.length(); j++) {

                char curCh = s.charAt(j);
                if (temp.indexOf(String.valueOf(curCh)) != -1) { //если найден в temp
                    break;
                } else {
                    temp.append(curCh);
                    counter++;
                }

            }

            if (counter > rezult) {
                rezult = counter;
            }
            counter = 0;
            temp.setLength(0);

            i++;
        }
        return rezult;

    }

}
