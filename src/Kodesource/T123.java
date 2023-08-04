/*
Напишите программу на Java, чтобы найти подмассив с наименьшей
 суммой из заданного массива целых чисел

 Например, для последовательности значений -2, 1, -3, 4;
 найти подмассив с наименьшей суммой
*/

package Kodesource;

public class T123 {
    public static void main(String[] args) {
        int[] inArr = {-2, 1, -3, 4};
        testmin(inArr);
    }

    static public int testmin(int[] inArr) {

        int indexMinStart = 0;
        int indexMinEnd = 0;

        int indexStart = 0;
        int indexEnd = 0;

        int curSum = 0;
        int sum = 0;

        while (indexEnd < inArr.length) {

            curSum = curSum + inArr[indexEnd];

            if (curSum < sum){
                sum = curSum;
                indexMinStart = indexStart;
                indexMinEnd = indexEnd;
                System.out.println("indexStart " + indexStart + " indexEnd " + indexEnd + " curSum " + curSum);
            }

            if (curSum >= 0) {
                curSum = 0;
                indexStart = indexEnd + 1;
            }

            indexEnd++;
        }
        System.out.println("-----------------------------------");
        System.out.println("indexMinStart " + indexMinStart + " indexMinEnd " + indexMinEnd + " sum " + sum);


        return sum;
    }
}
