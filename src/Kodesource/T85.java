//Напишите программу на Java, чтобы проверить, начинается ли
// строка с указанного слова. Перейти к редактору
//Пример данных: string1 = "Привет, как дела?"

package Kodesource;

public class T85 {
    public static void main(String[] args) {
        String input = "Привет, как дела?";
        System.out.println(checkStr(input));
    }

    static boolean checkStr(String str) {
        String s = "привет";
        if (str.regionMatches(true, 0, s, 0, s.length())){
            return true;
        }
        return false;
    }
}
