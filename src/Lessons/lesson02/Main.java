package Lessons.lesson02;

public class Main {
    public static void main(String[] args) {
        String str = "AAA";
        TestClass newStr = new TestClass(str);
        newStr.printLow();
        newStr.print();
        newStr.setStr("BBB");
        newStr.print();
    }
}
//-----------------------------------------------------
class TestClass {
    static String str1;

    protected TestClass(String str) {
        this.str1 = str;
    }

    public void printLow() {
        System.out.println(str1.toLowerCase());
    }

    public void print() {//геттер
        System.out.println(str1);
    }

    public void setStr(String newStr) {//сеттер
        str1 = newStr;
    }
}