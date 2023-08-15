package Lessons.lesson15;

public class Test1 {
    static void met1( interface1 t){
        System.out.println(t.met2("aaa"));
    }

    public static void main(String[] args) {
        met1(x -> x.length());
    }
}

interface interface1{
    int met2(String s);
}