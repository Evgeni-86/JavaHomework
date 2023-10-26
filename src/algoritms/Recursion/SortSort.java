import java.util.*;

public class SortSort {
    public static void main(String[] args) {
        test(new int[]{5, 6, 4, 2, 5, 8, 3, 5, -1, 2, 10, 9});
    }

    public static void test(int[] array) {
        int leftIndex = 0;
        int rightIndex = array.length - 1;

        int pivot = array[leftIndex];
        while (leftIndex <= rightIndex) {

            while (array[leftIndex] < pivot) {
                leftIndex++;
            }

            while (array[rightIndex] > pivot) {
                rightIndex--;
            }

            if (leftIndex <= rightIndex) {
                int temp = array[leftIndex];
                array[leftIndex] = array[rightIndex];
                array[rightIndex] = temp;
                leftIndex++;
                rightIndex--;
            }
        }
        System.out.println("leftIndex = " + leftIndex);
        System.out.println(Arrays.toString(array));
    }
}