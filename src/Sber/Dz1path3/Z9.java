package Sber.Dz1path3;
//Подсчитать количество введеных отрицательных чисел,
//вводим до первого положительного тогда показываем количество отрицательных
import java.util.Scanner;

public class Z9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rezult = 0;

        while (true) {
            int inputNum = scanner.nextInt();
            if (inputNum < 0) {
                rezult++;
            }
            else {
                System.out.println(rezult);
            }
        }

    }
}
