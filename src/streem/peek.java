package streem;

import java.util.stream.Stream;

public class peek {
    public static void main(String[] args) {
        Stream<String> integerStream1 = Stream.of("1", "2", "9", "7", "2");

        integerStream1.distinct().peek(e-> System.out.println(e)).count();
    }
}
