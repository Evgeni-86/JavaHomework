package Kodesource;

import java.util.Scanner;

//Перевод из восьмеричной системы счисления в десятичную
public class T25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int out = OctToDec.octToDec(scanner.nextInt());
        System.out.println(out);
    }
}

class OctToDec {
    static int octToDec(int input) {
        String inputStr = Integer.toString(input);
        int rezult = 0;
        for (int i = 0; i < inputStr.length(); i++) {
            char lastChar = inputStr.charAt(inputStr.length() - 1 - i);
            int lastInt = Character.getNumericValue(lastChar);
            rezult += lastInt * Math.pow(8, i);
        }
        return rezult;
    }
}