package Lessons.lesson19;

import java.io.File;
import java.io.FileReader;
import java.util.*;

public class Test {

    public static Map<Integer, Integer> count(int[] numbers) {
        Map<Integer, Integer> result = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            int currentNumbers = numbers[i];
            if (result.containsKey(currentNumbers)) {
                result.put(currentNumbers, result.get(currentNumbers) + 1);
                continue;
            }
            result.put(currentNumbers, 1);
        }
        return result;
    }

    public static Map<Integer, Integer> count2(int[] numbers) {
        Map<Integer, Integer> result = new HashMap<>();

        for (int i = 0; i < numbers.length; i++) {
            int currentNumbers = numbers[i];
            if (result.containsKey(currentNumbers)) {
                continue;
            }
            int count = 1;

            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] == numbers[i]){
                    count++;
                }
            }

            result.put(currentNumbers, count);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] numbers = {3, 2, 1, 2, 3, 4};

        System.out.println(count2(numbers));

        Parent parent = new Parent();
        Child child = new Child();

        parent.print("parent");

        child.print("child1");
        child.print(10);

    }


}

class Parent {
    public final void print(String mes) {
        System.out.println(mes);
    }
}
class Child extends Parent {
    public void print(int num) {
        System.out.println(num);
    }
}


