package Home;

import java.util.Scanner;

public class Dz14 {
    public static void main(String[] args) {
//        String[] arrStrings = CreateArrAndPrint.initializeArray();
//        CreateArrAndPrint.printArrReverse(arrStrings);
        CreateArrStrings.CreateArrsPrint();
    }
}

class CreateArrAndPrint {
    static String[] initializeArray() {
        String[] arrStrings = new String[10];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 8; i++) {
            String input = scanner.nextLine();
            arrStrings[i] = input;
        }
        return arrStrings;
    }

    static void printArrReverse(String[] inArr) {
        for (int i = inArr.length-1; i >= 0; i--) {
            System.out.println(inArr[i]);
        }
    }
}
//--------------------------------------------------
class CreateArrStrings {

    static void CreateArrsPrint() {
        int[] intArr = new int[10];
        int[] intArr2 = new int[5];
        int[] intArr3 = new int[5];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < intArr.length; i++) {
            int input = scanner.nextInt();
            intArr[i] = input;
        }
        int counter = intArr.length / 2;
        for (int i = 0; i < intArr.length; i++) {
            if (i < counter) {
                intArr2[i] = intArr[i];
            } else {
                intArr3[i-counter] = intArr[i];
            }
        }

        for (int elem: intArr2) {
            System.out.println(elem);
        }
        System.out.println("-----------------------------");
        for (int elem: intArr3) {
            System.out.println(elem);
        }
    }
}
//--------------------------------------------------
