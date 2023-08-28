package streem;

import java.util.stream.Stream;

public class count {
    public static void main(String[] args) {
        Stream<Integer> integerStream1 = Stream.of(1, 2, 9, 7, 2);

//        System.out.println(integerStream1.count());
        System.out.println(integerStream1.distinct().count());
    }
}
