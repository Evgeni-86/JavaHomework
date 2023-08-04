/*
Напишите программу на Java для добавления всех цифр
 заданного положительного целого числа, пока
 результат не будет иметь одну цифру.
 257 -> 14 -> 5
*/

package Kodesource;

public class T108 {
    public static void main(String[] args) {
        int num = 8578;

        while (num > 9) {
            String str = String.valueOf(num);
            int sum = 0;
            for (int i = 0; i < str.length(); i++) {
                sum += Integer.parseInt(String.valueOf(str.charAt(i)));
            }
            num = sum;
        }
        System.out.println(num);
    }
}
