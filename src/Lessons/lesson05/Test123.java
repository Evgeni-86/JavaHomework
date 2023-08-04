package Lessons.lesson05;

public class Test123 {
    public static void main(String[] args) {
        Dog d1 = new Dog();
    }
}

class Animal {
    Animal() {
        System.out.println("Это супер класс");
    }
}

class Dog extends Animal {
    Dog() {
        System.out.println("Это класс наследник");
    }
}
