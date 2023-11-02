package nestedClasses;

import java.util.HashMap;

public class Anonymous {
//    static A a = () -> System.out.println("AAA");

    public static void main(String[] args) {
//        a.doSome();
        HashMap<Integer, Integer> hashMap = new HashMap<>(10, 0.5f);
        A b = new A() {
            @Override
            public int doSome() {
                return 1;
            }
        };

        b.doSome();
    }
}

interface A {
    int doSome();
}
