//Напишите программу на Java, чтобы проверить, содержит
// ли массив целых чисел заданное число рядом друг с
// другом или есть два одинаковых заданных числа,
// разделенных одним элементом.

package Kodesource;

public class T97 {
    public static void main(String[] args) {
        int[] intArr = {10, 10, 45, 11, 1, 45, 5, 9, 20, 21, 45, 10, 2, 10};
        System.out.println(checArr(intArr, 10));
    }

    static boolean checArr(int[] arr, int number) {
        boolean rezult = false;
        int lable = 0;

        for (int i = 1; i < arr.length; i++) {
            lable = i - 2;

            if (arr[i] == number) {

                if (arr[i] == arr[i - 1]) {
                    System.out.println("index " + (i - 1) + " " + i);
                    rezult = true;
                }

                if (i > 1 && i - lable == 2 && arr[lable] == number) {
                    System.out.println("index " + lable + " " + i);
                    rezult = true;
                }

            }
        }

//----------------------------------------------------------------------------
//        for (int i = 0; i < arr.length; i++) {
//
//            if (arr[i] == 10) {
//
//                if (firstLableIndex == 0) {
//                    firstLableIndex = i;
//                } else if (secondLableIndex == 0) {
//
//                    if (i - firstLableIndex > 2){
//                        firstLableIndex = i;
//                        secondLableIndex = 0;
//                    } else {
//                        secondLableIndex =i;
//                    }
//
//                }
//
//            }
//
//            if (secondLableIndex - firstLableIndex == 1) {
//                firstLableIndex = 0;
//                secondLableIndex = 0;
//                rezult = true;
//            }
//            if (secondLableIndex - firstLableIndex == 2) {
//                firstLableIndex = 0;
//                secondLableIndex = 0;
//                rezult = true;
//            }
//
//        }

        return rezult;
    }
}
