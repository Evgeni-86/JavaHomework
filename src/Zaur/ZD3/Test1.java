package Zaur.ZD3;

class Test1 {
    int a = 1;
    static int b = 2;

    static void adc(final int a) {
        System.out.println(a);
        System.out.println(Test1.b);
    }

    public static void main(String[] args) {
        adc(5);
    }

}
