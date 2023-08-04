/*
Given two strings ransomNote and magazine, return
 true if ransomNote can be constructed by using
 the letters from magazine and false otherwise.

Each letter in magazine can only be used once in ransomNote.
*/
/*
Example 1:

Input: ransomNote = "a", magazine = "b"
Output: false
Example 2:

Input: ransomNote = "aa", magazine = "ab"
Output: false

Input: ransomNote = "aa", magazine = "aab"
Output: true
*/

package Leetcode;

import java.util.Arrays;

public class Z383RansomNote {
    public static void main(String[] args) {
        String ransomNote = "dd";
        String magazine = "leedcode";
        System.out.println(test(ransomNote, magazine));
    }

    static boolean test(String ran, String mag) {

        boolean rezult = true;

        for (int i = 0; i < ran.length(); i++) {
            char ch = ran.charAt(i);
            if (mag.indexOf(ch) == -1) {
                return false;
            }
            mag = mag.substring(0, mag.indexOf(ch)) + mag.substring(mag.indexOf(ch) + 1, mag.length());
        }
        return rezult;
    }
}
