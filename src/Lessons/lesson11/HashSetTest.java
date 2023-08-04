package Lessons.lesson11;
//множество Уникальных ключей (обьекты HashSet), значение заглушка константа
//На основе HashMap
//Сравнение по hashcode и equals

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {
    public static void main(String[] args) {
        HashSet<Person> hashSet = new HashSet<>();

        Person p1 = new Person(1, "Person1");
        Person p2 = new Person(2, "Person2");
        Person p3 = new Person(3, "Person3");
        Person p4 = new Person(4, "Person4");

        hashSet.add(p1);
        hashSet.add(p2);
        hashSet.add(p3);
        hashSet.add(p4);

        System.out.println(p3.hashCode());

        Person p5 = new Person(3, "Person3");
        System.out.println(p5.hashCode());

        //Поиск
        System.out.println(hashSet.contains(p5));

        //----Проходы----------------------------------
        for (Person person : hashSet) {
            System.out.println(person.toString());
        }
        System.out.println("------------------------------");

        //----------------------------------------------
        Iterator<Person> iterator = hashSet.iterator();
        while (iterator.hasNext()){
            Person cur = (Person) iterator.next();
            System.out.println(cur.name);
        }



    }
}
