package Ekkel;

import java.util.stream.IntStream;

public class VampireNumbers {
    public static void main(String[] args) {
        int rezult;

        for (int i = 10; i < 100; i++) {

            for (int j = 10; j < 100; j++) {

                String numbers1 = i + "" + j;
                int numbers2 = i * j;
                String strNumbers2 = String.valueOf(numbers2);
                IntStream sortNumbers1 = numbers1.chars().sorted();
                IntStream sortNumbers2 = strNumbers2.chars().sorted();
                String string1 = sortNumbers1.collect(StringBuilder::new,
                                                        StringBuilder::appendCodePoint,
                                                        StringBuilder::append).toString();
                String string2 = sortNumbers2.collect(StringBuilder::new,
                                                        StringBuilder::appendCodePoint,
                                                        StringBuilder::append).toString();
                if (string1.equalsIgnoreCase(string2)) {
                    System.out.println(numbers2 + " | " + i + " " + j);
                }
            }

        }
    }

}
