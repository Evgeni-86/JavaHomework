package Kodesource;

//Напишите программу на Java для вычисления суммы первых 100 простых чисел.
public class T66 {
    public static void main(String[] args) {
        int rezult = 0;
        int counter = 100;

        for (int i = 2; i < counter + 2; i++) {
            boolean rez = examination(i);
            if(rez) {
                rezult += i;
                System.out.println(i + " простое " + counter);
            } else {
                counter++;
            }
        }


        System.out.println(rezult);

    }

    static boolean examination(int number) {

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if ( number % i == 0) {
                return false;
            }
        }
        return true;
    }

}
