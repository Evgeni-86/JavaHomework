package javaRash;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Iphone {

    public static void main(String[] args) {
        String[] memory = {"object15", null, null, "object2", null, null, null, "object32", null, "object4"};
        executeDefragmentation(memory);
        System.out.println(Arrays.toString(memory));

//        List<Integer> integerList = new ArrayList<>();
//        test(integerList);
    }

    public static void test(List list){
        if (list == null) return;
        list.forEach(System.out::println);
    }

    public static void executeDefragmentation(String[] array) {
        //напишите тут ваш код
        int indexTarget = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                if (i == indexTarget) {
                    indexTarget++;
                    continue;
                }
                String temp = array[indexTarget];
                array[indexTarget++] = array[i];
                array[i] = temp;
            }
        }
    }
}
