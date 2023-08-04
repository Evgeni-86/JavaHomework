package Lessons.lesson07;

public class WrappersClasses {
    public static void main(String[] args) {
        char ch;
        char ch1 = 'a';

        Character ch2 = ch1; //автоупаковка
        ch = ch2; //автораспаковка

        int b = 10;
        System.out.println(test(b));

        //-----------------------------------------------
        long abc = 123;
        int value = 3;
        Integer value1 = 3;
        //эквивалентно
        Integer value2 = Integer.valueOf(3);
        System.out.println(value1 == value2);

        //------------------------------------------------
        Long long1 = Long.valueOf("45");
        long long2 = Long.parseLong("67");
        long long3 = Long.parseLong("101010", 2);
        int int4 = (int) Long.parseLong("45");

        System.out.println("long1 = " + long1);
        System.out.println("long2 = " + long2);
        System.out.println("long3 = " + long3);

        //---------------------------------------------
        Integer iOb = Integer.valueOf(100);
        System.out.println(iOb.byteValue());
        System.out.println(iOb.shortValue());
        System.out.println(iOb.intValue());
        System.out.println(iOb.longValue());
        System.out.println(iOb.floatValue());
        System.out.println(iOb.doubleValue());
        byte b1 = (byte) 128;
        int int1 = 1000;


    }


    static String test(Integer a) { //Автоупаковка
        return a.toString(); //
    }
}
