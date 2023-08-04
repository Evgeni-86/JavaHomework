/*
Напишите программу на Java, чтобы сформировать лестничную
 форму из n монет, где каждая k-я строка должна иметь ровно k монет
*/

package Kodesource;

public class T109 {
    public static void main(String[] args) {
        int number = 7;
        test(number);
    }

    static void test(int a) {
        int loop = 0;
        int counter = 0;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < a; i++) {
            sb.append("$");
            if (loop == counter) {
                System.out.println(sb);
                sb.setLength(0);
                loop = -1;
                counter++;
            }
            loop++;
        }

    }
}
