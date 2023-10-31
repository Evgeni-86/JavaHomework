package initialize;

public class Test {
    static {
        System.out.println("static");
    }

    {
        System.out.println("non static");
    }

    public static void main(String[] args) {
        Test test = new Test();
        Test test2 = new Test();
    }
}

