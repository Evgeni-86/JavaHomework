package Lessons.lesson11;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapTest {
    public static void main(String[] args) {

        LinkedHashMap<Person, String> linkedHashMap = new LinkedHashMap<>();

        Person p1 = new Person(1, "Person1");
        Person p2 = new Person(2, "Person2");
        Person p3 = new Person(3, "Person3");
        Person p4 = new Person(4, "Person4");

        linkedHashMap.put(p1, "A");
        linkedHashMap.put(p2, "B");
        linkedHashMap.put(p3, "C");
        linkedHashMap.put(p4, "D");

        Person p5 = new Person(3, "Person3");

        System.out.println(linkedHashMap.get(p5)); //Значение по ключу
        System.out.println(linkedHashMap.containsKey(p5));
        System.out.println(linkedHashMap.containsValue("B"));

        //--Проходы---------------------------------
        Iterator<Map.Entry<Person, String>> iterator1 = linkedHashMap.entrySet().iterator();
        while (iterator1.hasNext()){
            Map.Entry<Person, String> cur = iterator1.next();
            System.out.println(cur);
        }
        System.out.println("-----------------------------------");
        //------------------------------------------
        Iterator<String> iterator = linkedHashMap.values().iterator();//можно и по key
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("-----------------------------------");
        //-------------------------------------------
        for (Map.Entry<Person, String> personStringEntry : linkedHashMap.entrySet()) {
            System.out.println(personStringEntry);
        }

    }
}
