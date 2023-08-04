package Kodesource;

import java.util.Scanner;
//двоичное в шестнадцетеричное

class BinToHex {
//-----------------------------------------------------
    //Получим массив с десятичными значениями
    private static String[] decimalArr(long in) {

        String input = String.valueOf(in);
        int[] arrInt = new int[30];
        String[] rezult = new String[20];

        for (int i = 0; i < input.length(); i++) {
            //двигаемся справа на лево по символам
            char c = input.charAt(input.length() - 1 - i);
            //преобразуем символ в целое число
            int el = Character.getNumericValue(c);
            //заполняем массив с конца
            arrInt[arrInt.length - 1 - i] = el;
        }

        //отбираем по 4 элемента с конца массива
        int start = arrInt.length - 1;
        int end = start - 4;
        //сколько циклов отбора будет
        int counter = (input.length() / 4) + 1;
        //отбираем
        for (int i = 0; i < counter; i ++) {
            String str = "";
            for (int j = start; j > end; j--) {
                str = str + arrInt[j];
            }
            //реверс строки из 4 элементов (потому что шли с конца массива)
            StringBuilder sb = new StringBuilder(str);
            sb.reverse();
            System.out.println(sb);
            //переведем эти 4х значное бинарное число в десятичное
            double binaryToDecimal  = binaryToDecimal(sb.toString());
            int intValue = (int) Math.floor(binaryToDecimal);
            //добавляем в результат десятичное число
            rezult[i] = intValue + "";
            start = end;
            end = start - 4;
            System.out.println("----------------------");
        }
        return rezult;
    }
//----------------------------------------------------------------
//двочное в десятичное-----
    private static double binaryToDecimal (String in) {

        String input = in;
        double rezult = 0;

        for (int i = 0; i < input.length(); i++) {
            //двигаемся справа на лево по символам
            char c = input.charAt(input.length() - 1 - i);
            //преобразуем символ в целое число
            int el = Character.getNumericValue(c);
            rezult = rezult + (el * (Math.pow(2, i)));
        }
        return rezult;
    }


//----------------------------------------------------------
//-отображение в шестнадцетеричном виде
    private static String toHex(String[] arr) {
        String[] arrChar = {"A","B","C","D","E","F"};
        String rezult = "";
        for (String el: arr) {
            if (el != null) {
                int num = Integer.parseInt(el);
                if (num >= 10) {
                    rezult += arrChar[num - 10];
                } else {
                    rezult += num;
                }
            }
        }
        StringBuilder sb = new StringBuilder(rezult);
        return (sb.reverse().toString());
    }
//-----------------------------------------------------------
// Итог
    static void binToHex (long input) {
        String[] arrD = BinToHex.decimalArr(input);
        System.out.println( BinToHex.toHex(arrD) );
    }
}

public class T23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long number = scanner.nextLong();
        BinToHex.binToHex(number);
    }
}
