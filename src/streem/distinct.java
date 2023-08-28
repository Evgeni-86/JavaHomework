package streem;

import java.util.stream.Stream;

public class distinct {
    public static void main(String[] args) {
        Stream<Integer> integerStream1 = Stream.of(1, 2, 1, 7, 2);

        integerStream1.distinct().forEach(elem -> System.out.println(elem));

    }
}
