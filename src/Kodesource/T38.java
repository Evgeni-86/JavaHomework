package Kodesource;

import java.util.Scanner;

public class T38 {
    public static void main(String[] args) {
        int letters = 0;
        int digits = 0;
        int spaces = 0;
        int others = 0;
        String input = "Aa kiu, я swd skieo 236587. GH kiu: sieo ?? 25,33";
        for (int i = 0; i < input.length(); i++) {
            if (Character.isLetter(input.charAt(i))) {
                letters++;
            } else if (Character.isDigit(input.charAt(i))) {
                digits++;
            } else if (String.valueOf(input.charAt(i)).equalsIgnoreCase(" ")) {
                spaces++;
            } else {
                others++;
            }
        }
        String format = "letters: %s | digits: %s | spaces: %s | others: %s";
        System.out.printf(format, letters, digits, spaces, others);
    }
}
