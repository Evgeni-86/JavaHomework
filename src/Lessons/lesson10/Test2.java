package Lessons.lesson10;

public class Test2 {
    public static void main(String[] args) {
        int input = 12374;
        System.out.println(test(input));
    }

    static public int test(int num){
        if (num == 0) {
            return num;
        }
        return num % 10 + test(num / 10);
    }
}




