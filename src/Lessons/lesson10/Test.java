package Lessons.lesson10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Test {
    public static void main(String[] args) {


        Map<A, Integer> map1 = new HashMap<>();

        A a1 = new A("A", "A");
        A a2 = new A("A", "A");

        System.out.println(a1.hashCode());
        System.out.println(a2.hashCode());

        map1.put(a1, 1);

        System.out.println(map1.containsKey(a2));


    }
}

class A {
    String a;
    String b;

    public A(String a, String b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        A a1 = (A) o;
        return Objects.equals(a, a1.a) && Objects.equals(b, a1.b);
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b);
    }
}