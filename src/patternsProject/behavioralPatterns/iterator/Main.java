package patternsProject.behavioralPatterns.iterator;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);
        integers.add(5);


        OneAggregate oneAggregate = new OneAggregate("SomeAggregate", integers);

        System.out.println(oneAggregate.getName());
        Iterator iterator = oneAggregate.createIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
