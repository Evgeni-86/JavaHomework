package Examclouds.Generics;


public class MinMaxArray<T extends Number&Comparable<T>> {

    private T[] array;

    public MinMaxArray(T[] array) {
        this.array = array;
    }

    public T minElement() {
        T min = null;
        if (array.length > 0) {
            min = array[0];
            for (int i = 0; i < array.length; i++) {
                if (array[i].compareTo(min) < 0) {
                    min = array[i];
                }
            }
        }
        return min;
    }

    public T maxElement() {
        T max = null;
        if (array.length > 0) {
            max = array[0];
            for (int i = 0; i < array.length; i++) {
                if (array[i].compareTo(max) > 0) {
                    max = array[i];
                }
            }
        }
        return max;
    }
}

class Test2 {
    public static void main(String[] args) {
        Integer[] integers = {1,5,7,9,3,2,4,0};
        MinMaxArray<Integer> integerMinMaxArray = new MinMaxArray<>(integers);
        System.out.println(integerMinMaxArray.maxElement());
        System.out.println(integerMinMaxArray.minElement());
    }
}