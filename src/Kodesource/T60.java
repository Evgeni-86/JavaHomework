package Kodesource;
//Напишите программу на Java, чтобы найти предпоследнее
// (рядом с последним) слово предложения
public class T60 {
    public static void main(String[] args) {
        String input = "быстрая коричневая лиса перепрыгивает через ленивую собакe";
        String out = lastWord(input);
        System.out.println(out);
    }

    static String lastWord(String inputStr) {
        String[] strArr = inputStr.split(" ");
        String last = strArr[strArr.length - 2].trim();
        return last;
    }
}
