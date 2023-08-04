//Напишите программу на Java, чтобы проверить, появляется ли
// значение 20 три раза и нет ли 20 рядом друг с
// другом в данном массиве целых чисел.

package Kodesource;

public class T98 {
    public static void main(String[] args) {
        int[] intArr = {2, 20, 20, 11, 1, 45, 20, 2, 20, 20, 2, 2, 20, 20};

        int counter = 0;
        int start = 0;
        boolean near = false;

        while (intArr[start] == 20) {
            counter++;
            start++;
        }

        for (int i = start + 1; i < intArr.length; i++) {
            System.out.println("counter " + counter);

            if (intArr[i] == 20) {
                counter++;

                if (intArr[i] == intArr[i - 1]) {
                    System.out.println(counter);
                    System.out.println(i + " " + (i-1));
                    near = true;
                }

            }

        }
        System.out.println(counter);
        System.out.println(near);
    }
}
