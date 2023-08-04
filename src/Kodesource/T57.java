package Kodesource;

public class T57 {
    public static void main(String[] args) {
        int number = 356;
        int rezult = 0;

//        for (int i = 1; i <= number; i++) {
//            for (int j = 1; j <= number; j++) {
//                if (i * j == number) {
//                    System.out.println(i + " " + j);
//                    rezult++;
//                }
//            }
//        }
//19
        for (int i = 1; i <= (int) Math.sqrt(number); i++) {
            if (number % i == 0 && i * i != number) {
                rezult += 2;
            } else if (i * i == number) {
                rezult++;
            }
        }

        System.out.println(rezult);
    }
}
