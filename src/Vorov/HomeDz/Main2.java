/*
Создать массив на 5 чисел.
Заполнить его числами с клавиатуры.
Найти максимальное и минимальное числа в массиве.
Вывести на экран максимальное и минимальное числа через пробел.
*/

package Vorov.HomeDz;

public class Main2 {
    public static void main(String[] args) {
        int[] intArr = {4, 2, 7, 1, 9, 5};

        int maxIndex = 0;
        int minIndex = 0;

        for (int i = 1; i<intArr.length; i++){
            if (intArr[i] > intArr[maxIndex]) {
                maxIndex = i;
            } else if (intArr[i] < intArr[minIndex]){
                minIndex = i;
            }
        }
        System.out.println("min num index : "+minIndex +" " +"max num index: " + maxIndex);
    }
}
