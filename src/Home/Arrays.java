package Home;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
//        int[] arrIn = new int[10];

//        for (int i = 0; i < arrIn.length; i++) {
//            arrIn[i] = i + 1;
//        }

//        int num = 10;
//        for (int i = 0; i < arrIn.length; i++) {
//            arrIn[i] = num--;
//        }

//        int num = 10;
//        for (int i = 0; i < arrIn.length; i++) {
//            arrIn[i] = num++;
//        }

//        int num = 29;
//        for (int i = 0; i < arrIn.length; i++) {
//            arrIn[i] = num--;
//        }

//        Scanner scanner = new Scanner(System.in);
//        int[] arrNew = new int[5];
//        for (int i = 0; i < arrNew.length; i++) {
//            arrNew[i] = scanner.nextInt();
//        }

//        int[] arrNew = {5,6,7,9,5,3,2};
//        int sum = 0;
//        for (int el: arrNew) {
//            sum += el;
//        }
//        System.out.println(sum);
//        int min = arrNew[0];
//        for (int el: arrNew) {
//            if (el <= min) {
//                min = el;
//            }
//        }
//        System.out.println(min);

//        for (int el: arrNew) {
//            System.out.println(el);
//        }

//        NewArr.initializeArray();
//        NewArr.showArr();
//        System.out.println(NewArr.max());

        for (int i = 0; i <= 10; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.printf("8");
            }
            System.out.println();
        }

    }
}

class NewArr {
    private static int[] arr = new int[6];
    protected static void initializeArray() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
    }
    protected static void showArr() {
        System.out.println("---Array----------------");
        for (int el: arr) {
            System.out.println(el);
        }
        System.out.println("------------------------");
    }
    protected static int max() {
        int max = arr[0];
        for (int el: arr) {
            if (el > max) {
                max = el;
            }
        }
        return max;
    }
}

