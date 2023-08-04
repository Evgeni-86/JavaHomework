package Sber.Dz1path3;
//РАЗМЕН СУММЫ
import java.util.Scanner;

public class Z6 {
    public static void main(String[] args) {
        int[] bank = {8, 4, 2, 1};
        String rezult = new String("");
        int remainder;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите сумму для размена : ");
        int input = scanner.nextInt();
        for (int i = 0; i < bank.length; i++) {
            if (bank[i] <= input) {
                remainder = input % bank[i]; //запоминаем остаток от деления
                input = input / bank[i]; //получаем сколько купюр данного индекса массива
                rezult += input + " "; //записываем сколько купюр данного индекса массива
                input = remainder;
            } else {
                rezult += 0 + " "; //если купюр данного индекса не подходит
            }
        }

        System.out.println(rezult);
    }
}
