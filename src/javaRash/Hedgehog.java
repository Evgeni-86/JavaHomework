package javaRash;


class A {
    int a = 5;


    class B {
       int a = 10;

       public void start() {


       }
    }
}

class test {

    public static void main(String[] args) {
        A as = new A();
        A.B bb = as.new B();
        System.out.println(bb.a);
    }

}