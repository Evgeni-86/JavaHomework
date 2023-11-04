package mult;


public class Test {
    public static void main(String[] args) {
        int a = Integer.parseInt("11000000", 2);
        System.out.println("Dec = " + a);
        int i = -1;
        i = i >>> 1;
        System.out.println("Binary = " + Integer.toBinaryString(i));
        System.out.println("Dec = " + i);
        System.out.println("Binary = " + Integer.toBinaryString(i));
    }
}
