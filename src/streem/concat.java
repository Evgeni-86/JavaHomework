package streem;

import java.util.stream.Stream;

public class concat {
    public static void main(String[] args) {
        Stream<Integer> integerStream1 = Stream.of(1, 2, 9, 7, 2);
        Stream<Integer> integerStream2 = Stream.of(4, 16, 2, 8, 3);

        Stream<Integer> integerStreamOut = Stream.concat(integerStream1, integerStream2);

        integerStreamOut.forEach(elem -> System.out.println(elem));
    }
}
