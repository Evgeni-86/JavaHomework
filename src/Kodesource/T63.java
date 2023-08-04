package Kodesource;

//Напишите программу на Java, которая принимает два целочисленных
// значения от пользователя и возвращает большие значения. Однако,
// если два значения одинаковы, вернуть 0 и вернуть меньшее значение,
// если два значения имеют одинаковый остаток при делении на 6.
public class T63 {
    public static void main(String[] args) {
        int a = 15;
        int b = 25;

        System.out.println(test(a, b));
    }

    static int test(int a, int b) {
        if (a == b) {
            return 0;
        }
        if (a % 6 == b % 6) {
            return (a > b) ? a : b;
        } else {
            return (a > b) ? a : b;
        }
    }
}
