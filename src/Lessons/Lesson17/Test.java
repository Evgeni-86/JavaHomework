package Lessons.Lesson17;

import java.util.Comparator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Test {

    public static void main(String[] args) {
        String s = "aaaaaa";

        Function<String, String> function = (elem) -> elem.toUpperCase();
        String sUpper = function.apply(s);
        System.out.println(sUpper);


        Predicate<String> predicate = (elem) -> elem.length() % 2 == 0;
        System.out.println(predicate.test(s));

        Predicate<String> predicate1 = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.length() % 2 == 0;
            }
        };

        System.out.println(predicate1.test(s));
    }


}

