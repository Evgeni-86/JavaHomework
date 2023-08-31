package Leetcode.Medium;

import javax.swing.text.AttributeSet;

public class StringToIntegerAtoi {
    public static void main(String[] args) {
        String s = "__   -42";
        test(s);
    }

    public static void test(String s){

        StringBuilder sb = new StringBuilder();
        Character previosChar = '+';

        int index = 0;
        while (index < s.length()){

            if(Character.isDigit(s.charAt(index))){
                sb.append(s.charAt(index));
            }

            if (Character.isDigit(previosChar)){
                if (previosChar == '-'){
                    sb.insert(0, previosChar);
                }
                break;
            }

            index++;
        }

        System.out.println(sb);
    }
}
