package Lessons.lesson09;


public class Vopros {
    public String str;
}
class Test {
    public static void main(String[] args) {
        Vopros v1 = new Vopros();
        System.out.println(v1.str);//out-> null (значение по умолчанию)
//        v1.str += "asd";
        System.out.println(v1.str);//out-> nullasd -> Значить была создана строка со значением "null"
        v1.str.toLowerCase();
    }
}