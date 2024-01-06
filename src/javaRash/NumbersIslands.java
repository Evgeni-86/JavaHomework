package javaRash;

/*
Алгоритмы-прямоугольники
*/

public class NumbersIslands {
    public static void main(String[] args) {
        byte[][] a1 = new byte[][]{
                {1, 1, 0, 0},
                {1, 1, 1, 0},
                {1, 1, 0, 0},
                {0, 0, 0, 1}
        };
        byte[][] a2 = new byte[][]{
                {1, 0, 1, 1},
                {0, 0, 1, 1},
                {0, 0, 0, 0},
                {1, 0, 0, 1}
        };

        int count1 = getRectangleCount(a1);
        System.out.println("count = " + count1 + ". Должно быть 2");
        int count2 = getRectangleCount(a2);
        System.out.println("count = " + count2 + ". Должно быть 4");
    }

    public static int getRectangleCount(byte[][] a) {
        int counter = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] == 1)
                    counter += test(a, j, i);
            }
        }

        System.out.println("====================");
        for (byte[] bytes : a) {
            for (byte b : bytes) {
                System.out.print(b + " ");
            }
            System.out.println();
        }
        return counter;
    }

    public static int test(byte[][] arr, int x, int y) {
        int startY = (y - 1) >= 0 ? y - 1 : y;
        int startX = (x - 1) >= 0 ? x - 1 : x;

        for (int i = startY; i <= ((y + 1) < arr.length ? y + 1 : y); i++) {
            for (int j = startX; j <= ((x + 1) < arr.length ? x + 1 : x); j++) {
                if (arr[i][j] == 1) {
//                    System.out.println("x = " + j + " : " + "y = " + i);
                    arr[i][j]++;
                    test(arr, j, i);
                }
            }
        }
        return 1;
    }
}

