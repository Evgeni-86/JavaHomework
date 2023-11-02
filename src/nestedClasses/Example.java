package nestedClasses;


public class Example {

    public class InnerClass {
        public static int Index = 1;
        public int a = 10;

        public void abc() {

        }
    }
}

class Test {
    public static void main(String[] args) {
        Example example = new Example();
        Example.InnerClass exampleInner = example.new InnerClass();
        System.out.println(exampleInner.a);
        int index = Example.InnerClass.Index;
        System.out.println(index);
    }
}