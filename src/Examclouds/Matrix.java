package Examclouds;

import java.util.Arrays;

class Matrix {
    int[][] arrInteger;
    int matrixStrings;

    Matrix(int[][] matrix) {
        this.arrInteger = matrix;
        this.matrixStrings = matrix.length;
    }

    //--------------------------------------------------------------
    int[][] sum(int[][] inputMatrix) {
        int[][] outerArr;

        if (inputMatrix.length > this.arrInteger.length) {
            outerArr = Arrays.copyOf(inputMatrix, inputMatrix.length);
        } else {
            outerArr = Arrays.copyOf(this.arrInteger, this.arrInteger.length);
        }

        int counterOuter = Math.min(inputMatrix.length, this.arrInteger.length);
        for (int i = 0; i < counterOuter; i++) {

            int counterInner = Math.min(inputMatrix[i].length, this.arrInteger[i].length);
            for (int j = 0; j < counterInner; j++) {
                outerArr[i][j] = inputMatrix[i][j] + this.arrInteger[i][j];
            }

        }
        return outerArr;
    }
}

class TestMatrix {
    public static void main(String[] args) {
        int[][] arr1 = {{1, 2, 4}, {9, 8, 1}, {6, 5, 2}};
        int[][] arr2 = {{1, 4}, {9, 8, 1}};

        Matrix matrix1 = new Matrix(arr1);

        for (int[] elem : matrix1.sum(arr2)) {
            System.out.print(Arrays.toString(elem));
        }
    }
}
