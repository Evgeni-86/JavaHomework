package javaRash;


import java.io.*;
import java.util.Arrays;

/*
Файлы и исключения
*/

public class Solution1 {
    public static void main(String[] args) {


        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedReader bufR = new BufferedReader(new FileReader(br.readLine()));
             BufferedWriter bufW = new BufferedWriter(new FileWriter(br.readLine()))
        ) {

            while (bufR.ready()) {
                String[] out = bufR.readLine().split(" ");
                for (String s : out)
                    bufW.write(Math.round(Double.parseDouble(s)) + " ");
            }

        } catch (IOException e) {
            throw new RuntimeException();
        }

    }


}