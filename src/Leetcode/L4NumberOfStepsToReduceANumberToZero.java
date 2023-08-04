//Учитывая целое число, вернуть количество шагов, чтобы уменьшить его до нуля.
//
//за один шаг, если текущее число четное, вы должны разделить его на 2,
//в противном случае вы должны вычесть из него 1.

package Leetcode;

public class L4NumberOfStepsToReduceANumberToZero {
    public static void main(String[] args) {
        System.out.println(numberToZero(16));
    }


    static int numberToZero(int inputNum) {
        int counter = 0;

        while (inputNum > 0) {
            if (inputNum % 2 == 0) {
                inputNum /= 2;
            } else {
                inputNum--;
            }
            counter++;
        }
        return counter;
    }
}
