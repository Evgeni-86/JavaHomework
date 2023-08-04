/*
Напишите метод, заменяющий в строке каждое второе вхождение «object-oriented programming»
(не учитываем регистр символов) на «OOP». Например, строка
"Object-oriented programming is a programming language model organized around objects rather than "actions"
and data rather than logic. Object-oriented programming blabla. Object-oriented programming bla."
должна быть преобразована в
"Object-oriented programming is a programming language model organized around objects
rather than "actions" and data rather than logic. OOP blabla. Object-oriented programming bla."
*/

package Examclouds.StringsTest;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        String s = "Object-oriented programming is a programming language model organized around objects rather than \"actions\"+" +
                " and data rather than logic. Object-oriented programming blabla. Object-oriented programming bla.";
/////////////////////////////////////////////////////////////41
//        String s = "Object-oriented programming is a program logic. Object-oriented programming blabla. Ob";

        String rep = "object-oriented programming";

        System.out.println(test(s, rep));
    }

    public static String test(String s, String rep) {

        int counter = 0;
        int indexStart = -1;
        int pointer = 0; //увеличивается если символы совпадают
        StringBuilder sb = new StringBuilder(s);
        System.out.println(sb);

        for (int i = 0; i < sb.length(); i++) {
            Character ch = Character.toLowerCase(sb.charAt(i));

            if (ch == rep.charAt(0) && indexStart == -1){
                indexStart = i;
            }

            if(ch != rep.charAt(pointer)) {
                indexStart = -1;
                pointer = 0;
            }

            if (ch == rep.charAt(pointer) && indexStart > -1) {
                pointer++;
            }

            if (pointer == rep.length()) {
                counter++;//счетчик повторяющегося вхождения

                if (counter % 2 == 0){
                    sb.replace(indexStart, i + 1, "OOP");
                }

                pointer = 0;
                indexStart = -1;
            }

        }
        return sb.toString();
    }

}
