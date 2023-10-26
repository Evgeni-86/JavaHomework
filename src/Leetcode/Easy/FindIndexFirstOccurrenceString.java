//Find the Index of the First Occurrence in a String

public class FindIndexFirstOccurrenceString {
    public static void main(String[] args) {
        String haystack = "leetcode";
        String needle = "leeto";
        System.out.println(strStr(haystack, needle));
    }

    public static int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }
}