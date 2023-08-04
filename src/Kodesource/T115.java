//Напишите программу на Java, чтобы проверить, является ли положительное число палиндромом или нет.

package Kodesource;

public class T115 {
    public static void main(String[] args) {
        System.out.println(test(150));
    }

    static public boolean test(int number) {
        String s = String.valueOf(number);

        int i = 0;
        int j = s.length() - 1;

        while (i < j){
            if (s.charAt(i++) != s.charAt(j--)){
                return false;
            }
        }
        return true;
    }
}
