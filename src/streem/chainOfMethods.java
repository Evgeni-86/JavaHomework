package streem;

import com.sun.source.tree.ReturnTree;

import java.util.Arrays;

public class chainOfMethods {
    public static void main(String[] args) {
        int[] array = {5, 12, 3, 8, 1};

        array = Arrays.stream(Arrays.stream(array).filter(elem -> elem % 2 == 1).toArray()).
                map(elem -> elem * 2).reduce((accum, elem) -> accum + elem).stream().toArray();
        System.out.println(Arrays.toString(array));
    }
}
