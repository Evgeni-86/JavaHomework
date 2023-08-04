/*
Предложение состоит из нескольких слов, например:
 "Если есть хвосты по дз, начните с 1 не сданного
 задания. 123 324 111 4554". Среди слов, состоящих
 только из цифр, найти слово палиндром.
*/

package Examclouds.StringsTest;

public class Test13 {
    public static void main(String[] args) {
        String s = "Если есть хвосты по дз, начните с 1 не сданного задания. 123 324 111 4554";
        System.out.println(test(s));
    }

    static public String test(String s) {

        String[] sArr = s.split("\\s+");

        String a;
        for (int i = 0; i < sArr.length; i++) {

            a = sArr[i];

            if (a.length() > 1 && a.matches("[0-9]*")) {

                boolean pal = a.equalsIgnoreCase(new StringBuilder(a).reverse().toString());
                if (pal){
                    return a;
                }
            }

        }

        return "нет палиндрома";
    }
}
