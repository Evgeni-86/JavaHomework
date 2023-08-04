//Множество значений в виде дерева
//В основе TreeMap лежит TreeMap
//Хранить ключ, значение заглушка константа
//поиск по comparablTo

package Lessons.lesson11;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {

        TreeSet<Person> treeSet = new TreeSet<>(new ClassAComparatorName());//Используем созданый компаратор по "name"

        Person p1 = new Person(1, "Person1");
        Person p2 = new Person(2, "Person3");
        Person p3 = new Person(3, "Person4");
        Person p4 = new Person(4, "Person2");

        treeSet.add(p1);
        treeSet.add(p2);
        treeSet.add(p3);
        treeSet.add(p4);

        System.out.println(treeSet);

        Person p5 = new Person(3, "Person3");

        //--Поиск----
        System.out.println(treeSet.contains(p5));//сравниваем по "id"

        //--Итератор-----------------------------
        for (Person person : treeSet) {
            System.out.println(person);
        }
        System.out.println("--------------------------------");
        //----------------------------------------

        Iterator<Person> iterator = treeSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next().name);
        }
        System.out.println("--------------------------------");
        //----------------------------------------

        Iterator<Person> iterator1 = treeSet.iterator();
        while (iterator1.hasNext()){
            System.out.println(iterator1.next().id);
        }


    }
}
