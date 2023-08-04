/*
Напишите программу на Java, чтобы найти индекс значения в
 отсортированном массиве. Если значение не найдено,
 верните индекс, где он был бы, если бы он был вставлен
 в порядке. Перейти к редактору
Пример:

[1, 2, 4, 5, 6] 5 (цель) -> 3 (индекс)
[1, 2, 4, 5, 6] 0 (цель) -> 0 (индекс)
[1, 2, 4, 5, 6] 7 (цель) -> 5 (индекс)
*/

package Kodesource;

public class T124 {
    public static void main(String[] args) {
        int[] inArr = {1, 2, 4, 5, 6};
        System.out.println(test(inArr, 7));
    }

    static public int test(int[] inArr, int num) {

        int indexVirtual = 0;
        int i = 0;

        while (i < inArr.length) {

            if (num == inArr[i]) {
                return i;
            } else if (num > inArr[i]) {
                indexVirtual++;
            } else {
                break;
            }

            i++;
        }

        return indexVirtual;
    }
}
