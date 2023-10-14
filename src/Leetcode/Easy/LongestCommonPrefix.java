package Leetcode.Easy;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
//        String[] strs = {"aaa","aa","aaa"};
//        String[] strs = {"a"};

        System.out.println(longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }

        String rezult = strs[0];

        for (int i = 1; i < strs.length; i++) {

            String currentString = strs[i];
            String temp = "";

            for (int j = 0; j < currentString.length(); j++) {
                String start = currentString.substring(0, j + 1).intern();
                if (rezult.startsWith(start)) {
                    temp = start;
                } else {
                    if (j == 0){
                        return "";
                    }
                    break;
                }
            }

            if (temp.length() <= rezult.length()){
                rezult = temp;
            }

        }
        return rezult;
    }

    public static String longestCommonPrefix2(String[] strs) {
        if (strs.length == 0) {
            return "";
        }

        String rezult = strs[0];

        for (int i = 1; i < strs.length; i++) {

           while (strs[i].indexOf(rezult) != 0){
               rezult = rezult.substring(0, rezult.length() - 1);
               if (rezult.isEmpty()){
                   return "";
               }
           }
        }

        return rezult;
    }

}
