package Lessons.lesson11;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapTest {
    public static void main(String[] args) {

        TreeMap<Person, Integer> treeMap = new TreeMap<>();

        Person p1 = new Person(1, "Person1");
        Person p2 = new Person(2, "Person2");
        Person p3 = new Person(3, "Person3");
        Person p4 = new Person(4, "Person4");

        treeMap.put(p1, 3);
        treeMap.put(p3, 2);
        treeMap.put(p2, 4);
        treeMap.put(p4, 7);

        System.out.println(treeMap);

        Person p5 = new Person(3, "Person3");

        System.out.println(treeMap.containsKey(p5));
        System.out.println(treeMap.containsValue(4));

        //Перебор
        //-----------------Итератор---------------------------
        Iterator<Map.Entry<Person, Integer>> iterator = treeMap.entrySet().iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        //-------------Итератор короткая запись---------------
        for (Person person : treeMap.keySet()) {
            System.out.println(person.name);
        }
        for (Integer value : treeMap.values()) {
            System.out.println(value);
        }

    }
}
