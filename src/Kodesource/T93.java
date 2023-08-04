//Напишите программу на Java, чтобы проверить,
// содержит ли массив целых чисел элемент
// 10 рядом с 10 или элемент 20 рядом с 20, но не оба.

package Kodesource;

import java.util.Arrays;
import java.util.List;

public class T93 {
    public static void main(String[] args) {
        int[] intArr = {12, 3, 45, 10, 10, 32, 45, 5, 9, 20, 21, 45, 88, 44};
        System.out.println(test(intArr));
    }

    static boolean test(int[] arrInt) {
        boolean rez = false;
        int foundFirst = 0;

        for (int i = 0; i < arrInt.length; i++) {
            if (arrInt[i] == 10 || arrInt[i] == 20) {

                if (i > 0 && i < arrInt.length - 1) { //исключили первый и последний. чтоб не выйти

                    if (arrInt[i - 1] == arrInt[i] || arrInt[i] == arrInt[i + 1]) {//сравниваем слева и справа

                        if (foundFirst == arrInt[i] || foundFirst == 0) { //если совпадает с уже найденым или еще не нашли
                            rez = true;
                            foundFirst = arrInt[i];
                        } else { // если условие прошло но мы уже нашли элемент
                            rez = false;
                        }

                    }

                }

            }
        }
        return rez;
    }

}
