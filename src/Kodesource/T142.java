/*
Напишите программу на Java, чтобы проверить, являются ли две данные строки анаграммами или нет.
Согласно Википедии «Анаграмма - это слово или фраза, образованная путем перестановки
 букв другого слова или фразы, обычно используя все исходные буквы ровно один раз.
 Например, слово анаграмма может быть переставлено в nag ram, или слово двоичное в мозги. "

Пример вывода: String-1: wxyz
Строка-2: zyxw
Проверьте, являются ли две данные строки анаграммами или нет ?: true
*/

package Kodesource;

import java.util.Arrays;


public class T142 {
    public static void main(String[] args) {
        String s1 = "wxyz";
        String s2 = "zyxw";
        System.out.println(test(s1, s2));
    }

    public static boolean test(String str1, String str2) {

        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

      return   Arrays.equals(ch1, ch2);
    }
}

//public class T142 {
//    public static void main(String[] args) {
//        String s1 = "wxyz";
//        String s2 = "zyxw";
//        System.out.println(test(s1, s2));
//    }
//
//    public static boolean test(String str1, String str2) {
//        if (str1 == null || str2 == null) {
//            return false;
//        } else if (str1.length() != str2.length()) {
//            return false;
//        } else if (str1.length() == 0) {
//            return true;
//        }
//        TreeSet<Integer> charactersS1 = new TreeSet<>();
//        TreeSet<Integer> charactersS2 = new TreeSet<>();
//        for (int i = 0; i < str1.length(); i++) {
//            charactersS1.add((int) str1.charAt(i));
//            charactersS2.add((int) str2.charAt(i));
//        }
//        return charactersS1.equals(charactersS2);
//
//    }
//}

//public class T142 {
//    public static void main(String[] args) {
//        String str1 = "wxyz";
//        String str2 = "zyxw";
//        System.out.println("String-1 : " + str1);
//        System.out.println("String-2 : " + str2);
//        System.out.println("Check if two given strings are anagrams or not?: " + anagram_test(str1, str2));
//    }
//
//    public static boolean anagram_test(String str1, String str2) {
//        if (str1 == null || str2 == null) {
//            return false;
//        } else if (str1.length() != str2.length()) {
//            return false;
//        } else if (str1.length() == 0 && str2.length() == 0) {
//            return true;
//        }
//        int[] count = new int[256];
//        for (int i = 0; i < str1.length(); i++) {
//            System.out.println(Arrays.toString(count));
//            count[str1.charAt(i)]++;
//            count[str2.charAt(i)]--;
//        }
//        for (int num : count) {
//            if (num != 0) {
//                return false;
//            }
//        }
//        return true;
//    }
//}
