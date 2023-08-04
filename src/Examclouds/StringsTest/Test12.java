/*
Предложение состоит из нескольких слов, разделенных пробелами.
 Например: "One two three раз два три one1 two2 123 ".
 Найти количество слов, содержащих только символы латинского алфавита.
*/


package Examclouds.StringsTest;

public class Test12 {
    public static void main(String[] args) {
        String s = "One two three раз два три one1 two2 123";
        test(s);
    }

    static public int test(String s) {

        String[] sArr = s.split("\\s+");

        int counter = 0;

        String cur;
        for (int i = 0; i < sArr.length; i++) {

            cur = sArr[i];

            if (cur.matches("[а-яА-Я]*")) {
                counter++;
            }

        }

        return counter;
    }
}
