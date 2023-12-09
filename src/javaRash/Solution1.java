package javaRash;


import java.io.*;


/*
Четные символы
*/

public class Solution1 {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             FileReader fileReader = new FileReader(br.readLine())
        ) {
            int counter = 0;
            String res = "";
            while (fileReader.ready()) {
                char cur = (char) fileReader.read();

                if (Character.isLetter(cur))
                    res += cur;

                if(!fileReader.ready() || !Character.isLetter(cur)) {
                    if (res.equals("world"))
                        counter++;
                    res = "";
                }
            }

            System.out.println(counter);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
