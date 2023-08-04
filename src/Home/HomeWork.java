package Home;

public class HomeWork {
    public static void main(String[] args) {
        int rez;
        float rez2;
        String str = "Test";
        rez = sum(20, 10);
        System.out.println(rez);
        rez = multy(20, 10);
        System.out.println(rez);
        rez = subt(20, 10);
        System.out.println(rez);
        rez = div(20, 10);
        System.out.println(rez);
        rez2 = convert(4.5f);
        System.out.println(rez2);
        rez2 = percent(12.5f);
        System.out.println(rez2);
        print(str);
    }
    public static int sum(int number1, int number2) {
        return (number1 + number2);
    }
    public static int multy(int number1, int number2) {
        return (number1 * number2);
    }
    public static int subt(int number1, int number2) {
        return (number2 - number1);
    }
    public static int div(int number1, int number2) {
        return (number1 / number2);
    }
    public static float convert(float euro) {
        float multipl = 0.7f;
        return (euro * multipl);
    }
    public static float percent(float number) {
        float rez = (number * 10) / 100;
        return (number + rez);
    }
    public static void print(String str) {
        System.out.println(str);
        System.out.println(str);
        System.out.println(str);
        System.out.println(str);
    }
}
