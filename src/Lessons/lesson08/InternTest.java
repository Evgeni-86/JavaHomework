package Lessons.lesson08;

public class InternTest {
    public static void main(String[] args) {
        String str1 = "as";
        String str2 = new String("asd").intern();//вернет строку из StringPool
        System.out.println(str1 == str2);//указывают на один и тотже обьект в SP
    }
}
