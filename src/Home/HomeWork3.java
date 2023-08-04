package Home;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeWork3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        /*String str1 = reader.readLine();
        String str2 = reader.readLine();*/

        /*int num = Integer.parseInt(str2);
        while (num > 0) {
            System.out.println(str1);
            num--;
        }*/

        /*int num1 = Integer.parseInt(str1);
        int num2 = Integer.parseInt(str2);
        int sumb = 8;
        for (int i = 0; i < num1; i++) {
            for (int j = 0; j < num2; j++) {
                String str = Integer.toString(sumb);
                System.out.printf(str);
            }
            System.out.println();
        }*/

        /*int num1 = Integer.parseInt(str1);
        int num2 = Integer.parseInt(str2);
        String sumb = "P";
        while (num1 > 0) {
            int counter = num2;
            while (counter > 0) {
                System.out.printf(sumb);
                counter--;
            }
            System.out.println();
            num1--;
        }*/

        int num = 0;
        int rez = 0;
        do {
            String inputNum = reader.readLine();
            num = Integer.parseInt(inputNum);
            System.out.println(rez += num);
        } while (num >= 0);


    }
}
