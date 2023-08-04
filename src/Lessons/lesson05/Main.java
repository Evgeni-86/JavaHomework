package Lessons.lesson05;

//ДЗ    1) Сбер 9, 10

public class Main {
    final int a;

    public Main(int a) {
        this.a = a;
    }
}
//Два способы инициализировать Final

//Вопрос по строкам
//Значит строка str3 инициализируется непосредственно в коде и помещается в StringPool
//а строка str4 состоит из непосредственно строки и только ссылки на другую строку и
//сразу в StringPool не помещается?
class Test{
    public static void main(String[] args) {
        String str1 = "Hello Java";
        String str2 = " Java";

        String str3 = "Hello" + " Java";
        String str4 = "Hello" + str2;

        System.out.println(str1 == str3);//true
        System.out.println(str1 == str4);//false
        System.out.println(str1.equalsIgnoreCase(str4));//true
    }
}


