package Kodesource;
//Перевод из двоичной системы счисления в восьмеричную
import java.util.Scanner;

public class T24 {
}

class binToDec {
    static int binToDec(String input) {
        String strInput = input;
        int rezult = 0;
        for (int i = 0; i < strInput.length(); i++) {
            char lastChar = strInput.charAt(strInput.length() - 1 - i);
            int lastNum = Character.getNumericValue(lastChar);
            rezult += ( lastNum * Math.pow(2, i) );
        }
        return rezult;
    }
}

class decToOct {
    static String decToOct(int input) {
        int inNum = input;
        String rezult = new String("");
        while (inNum > 0) {
            rezult += ( "" + ( inNum - (inNum/8 * 8) ) );
            inNum = inNum / 8;
        }
        StringBuilder sb = new StringBuilder(rezult);
        sb.reverse();
        return sb.toString();
    }
}

class binToOct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int a = binToDec.binToDec(input);
        String out = decToOct.decToOct(a);
        System.out.println(out);
    }
}
