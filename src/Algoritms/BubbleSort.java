package Algoritms;

public class BubbleSort {
    public static void main(String[] args) {

        int[] numbers = {12, 6, 4, 1, 15, 4, 89, 3, 12, 4};
//        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int counter = 0;
        int counter2 = 0;
        int counter3 = 0;

//        int lastInd = numbers.length - 1;
//        boolean sortEnd = false;
//        while (!sortEnd) {
//            sortEnd = true;
//            for (int j = 0; j < lastInd; j++) {
//                if (numbers[j] > numbers[j + 1]) {
//                    int num = numbers[j + 1];
//                    numbers[j + 1] = numbers[j];
//                    numbers[j] = num;
//                    sortEnd = false;
//                }
//            counter3++;
//            }
//        }
//
//        for (int el : numbers) {
//            System.out.print(el + " ");
//        }
//        System.out.printf("Выполнено итераций: %d", counter3);
//        System.out.println();
//-------------------------------------------------------------------------------
        int lastInd = numbers.length - 1;
        for (int i = 0; i < lastInd; i++) {

            for (int j = 0; j < lastInd - i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int num = numbers[j + 1];
                    numbers[j + 1] = numbers[j];
                    numbers[j] = num;
                }
                counter++;
            }
            counter++;
        }

        for (int el : numbers) {
            System.out.print(el + " ");
        }
        System.out.printf("Выполнено итераций: %d", counter);
        System.out.println();
//-----------------------------------------------------------------------------------
//        int lastIndex = numbers.length - 1;
//        for (int i = 0; i <= lastIndex; i++) {
//
//            if (numbers[i] >= numbers[i + 1]) {
//                int num = numbers[i];
//                numbers[i] = numbers[i + 1];
//                numbers[i + 1] = num;
//            }
//
//            if (i == lastIndex - 1) { //если находимся на предпоследней позиции
//                i = -1; //делаем отрицательной, т.к в конце цикла она увеличится на 1 важно!!!
//                lastIndex -= 1; //исключаем из цикла последний (самый большой) элемент
//            }
//            counter2++;
//        }

//        for (int el : numbers) {
//            System.out.print(el + " ");
//        }
//        System.out.printf("Выполнено итераций: %d", counter2);

    }
}
