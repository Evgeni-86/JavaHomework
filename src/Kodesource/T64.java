package Kodesource;

//Напишите программу на Java, которая принимает два
// целых числа от 25 до 75 и возвращает true, если
// в обоих числах есть общая цифра.
public class T64 {
    public static void main(String[] args) {
        System.out.println(test(26, 55));
    }

    static boolean test(int num1, int num2) {
        if (num1 >= 25 && num1 <= 75 && num2 >= 25 && num2 <= 75) {
            String num1Str = String.valueOf(num1);
            String num2Str = String.valueOf(num2);

            for (int i = 0; i < num1Str.length(); i++) {
                num1Str.charAt(i);
                for (int j = 0; j < num2Str.length(); j++) {
                    if (Character.compare(num1Str.charAt(i), num2Str.charAt(j)) == 0) {
                        return true;
                    }
                }
            }
            return false;
        }
        return false;
    }
}
