//Напишите программу на Java для создания строки в виде
// short_string + long_string + short_string из двух строк.
// Строки не должны иметь одинаковую длину.

package Kodesource;

public class T70 {
    public static void main(String[] args) {
        String str1 = "aaaaaaaaa";
        String str2 = "bbbbbbbbbbbbbbbb";

        System.out.println(str1 + " " + str2 + " " + str1);
    }
}
