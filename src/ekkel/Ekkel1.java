package ekkel;


class Test {
    int a;
    String str;

    Test(String str) {
        this.str = str;
    }

    Test(String str, int a) {
        this(str);
        this.a = a;
    }
}

public class Ekkel1 {
    public static void main(String[] args) {
        Test t1 = new Test("asd", 15);
        System.out.println(t1.a + " " + t1.str);
    }
}
