package Lessons.lesson11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapTest {
    public static void main(String[] args) {
        HashMap<Person, Integer> map1 = new HashMap<>();

        Person p1 = new Person(1, "Person1");
        Person p2 = new Person(2, "Person2");
        Person p3 = new Person(3, "Person3");
        Person p4 = new Person(4, "Person4");

        map1.put(p1, 45);
        map1.put(p2, 87);
        map1.put(p3, 63);
        map1.put(p4, 41);

        Person p5 = new Person(3, "Person3");

        System.out.println(p3.hashCode());
        System.out.println(p5.hashCode());

        //Поиски
        System.out.println(map1.containsKey(p5));
        System.out.println(map1.containsValue(45));
        //Перебор
        //-------------Итератор----------------------------------------------
        Iterator<Map.Entry<Person, Integer>> iterator = map1.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<Person, Integer> cur = iterator.next();
            System.out.print(cur.getKey() + " ");
            System.out.println(cur.getValue());
        }
        System.out.println("------------------------------------------");

        //-------------Итератор короткая-------------------------------------
        for (Map.Entry<Person, Integer> entry : map1.entrySet()) {
            System.out.print(entry.getKey() + " ");
            System.out.println(entry.getValue());
        }
        System.out.println("------------------------------------------");

        //-------------------------------------------------------------------
        for (Person person : map1.keySet()) {
            System.out.println(person.toString());
        }
        System.out.println("------------------------------------------");
        for (Integer value : map1.values()) {
            System.out.println(value);
        }


    }
}
