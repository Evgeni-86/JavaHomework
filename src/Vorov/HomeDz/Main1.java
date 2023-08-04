/*
Есть массив чисел, в котором все числа дублируются,
 кроме одного. Найдите число, которое
 не имеет дубликатов в массиве
*/

package Vorov.HomeDz;

public class Main1 {
    public static void main(String[] args) {
        int[] intArr = {1, 2, 3, 3, 4, 5, 7, 5, 6, 2, 4, 7, 6};

        int index = -1;

        for (int i = 0; i < intArr.length; i++) {

            for (int j = 0; j < intArr.length; j++) {
                index = i;
                if (intArr[i] == intArr[j] && i != j) {
                    index = -1;
                    break;
                }
            }
            if (index >= 0) {
                System.out.println("no double index: " + index);
            }

        }
    }
}
