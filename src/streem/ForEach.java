package streem;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

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


