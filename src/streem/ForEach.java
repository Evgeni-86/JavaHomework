package streem;

import java.util.Arrays;

public class ForEach {
    public static void main(String[] args) {
        int[] array = {5, 9, 3, 8, 1};

        Arrays.stream(array).forEach(elem -> {
            elem = elem * 2;
            System.out.println(elem);
        });


        Arrays.stream(array).forEach(System.out::print);

    }
}
