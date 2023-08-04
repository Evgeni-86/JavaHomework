/*
Напишите программу на Java, чтобы найти подмассив с наибольшей
 суммой из заданного массива целых чисел

 Например, для последовательности значений -2, 1, -3, 4, -1, 2, 1, -5, 4
 найти подмассив с наименьшей суммой
*/

package Kodesource;

public class T122 {

    public static void main(String[] args) {
        int[] numArr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        testmax(numArr);
    }

    public static int testmax(int[] inArr) {

        int indexMinStart = 0;
        int indexMinEnd = 0;


        int startIndex = 0;
        int endIndex = 0;

        int curSum = 0;
        int sum = 0;

        while (endIndex < inArr.length) {


            curSum = curSum + inArr[endIndex];

            if (curSum > sum) {
                sum = curSum;
                indexMinStart = startIndex;
                indexMinEnd = endIndex;
                System.out.println("indexMinStart " + indexMinStart + " indexMinEnd " + indexMinEnd + " sum " + sum);
            }

            if (curSum < 0) {
                curSum = 0;
                startIndex = endIndex + 1;
            }


            endIndex++;
        }
        System.out.println("-----------------------------------");
        System.out.println("indexMinStart " + indexMinStart + " indexMinEnd " + indexMinEnd + " sum " + sum);

        return 1;
    }
}
