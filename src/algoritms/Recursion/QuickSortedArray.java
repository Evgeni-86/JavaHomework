package algoritms.Recursion;

import java.util.ArrayList;

public class QuickSortedArray {
    public static void main(String[] args) {
        int[] numbers = {8, 1, 3, 12, 5, 6, 7, 8, 4, 2, 11, 7, 6};
        ArrayList<Integer> integers = new ArrayList<>();
        for (int elem : numbers) {
            integers.add(elem);
        }
        System.out.println(quickSort(integers));
    }

    public static ArrayList<Integer> quickSort(ArrayList<Integer> list) {

        if (list.size() < 2) {
            return list;
        }
        ArrayList<Integer> small = new ArrayList<>();
        ArrayList<Integer> large = new ArrayList<>();

        int pivot_index = 0;
        int pivot_elem = list.get(0);

        for (int i = 0; i < list.size(); i++) {
            int cur_elem = list.get(i);
            if (i == pivot_index) {
                continue;
            }
            if (cur_elem > pivot_elem) {
                large.add(cur_elem);
            } else {
                small.add(cur_elem);
            }
        }

        ArrayList<Integer> integers = new ArrayList<>();
        integers.addAll(quickSort(small));
        integers.add(pivot_elem);
        integers.addAll(quickSort(large));

        return integers;
    }
}
