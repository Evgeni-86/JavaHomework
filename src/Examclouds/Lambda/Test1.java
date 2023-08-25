/*
Перепишите код используя лямбда выражение.
*/

package Examclouds.Lambda;


interface Function {
    void call(String s);
}

class AnonymousInnerClass {
    public static void main(String[] args) {

//        Function function = new Function() {
//            public void call() {
//                System.out.println("Hello world");
//            }
//        };
//        function.call();

        Function fuc = (s) -> System.out.println(s);
        fuc.call("Hello world");

    }
}
