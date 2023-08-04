/*
Найти слово, в котором число различных символов минимально.
 Слово может содержать буквы и цифры. Если таких слов
 несколько, найти первое из них. Например, в
 строке "fffff ab f 1234 jkjk" найденное слово должно быть "fffff".
*/

package Examclouds.StringsTest;

import java.util.ArrayList;
import java.util.HashSet;

public class Test1 {
    public static void main(String[] args) {
        String s = "fffff ab f 1234 jjjfkjdjj";
        System.out.println(test(s));
    }

    public static String test(String s) {

        String rez = "";
        String temp = "";
        int counter = 0;
        int counter_rez = -1;

        for (int i = 0; i < s.length(); i++) {
            char cur = s.charAt(i);
            if (temp.contains(String.valueOf(cur))) {
                counter--;
            }

            if (cur != ' ') {
                temp += cur;
                counter++;
            }

            if (cur == ' ' || i == s.length() - 1) {
                if (temp.length() < 2){
                    temp = "";
                    counter = 0;
                    continue;
                }
                if (counter_rez == -1 || counter < counter_rez){
                    counter_rez = counter;
                    rez = temp;
                }
                counter = 0;
                temp = "";
                System.out.println("counter_rez " + counter_rez + " rez " + rez);
            }
        }

        System.out.println(counter_rez);
        return rez;
    }
}
