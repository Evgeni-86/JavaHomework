package Lessons.lesson06;

public class Polimorf {
    public static void main(String[] args) {
        Child child1 = new Child();
        child1.show("AAAAAA");
        Beast herb = new herbivorous();
        herb.eat();
    }
}

class Parent {
    void show(int a) { //перегрузка
        System.out.println();
    }

    void show(String str) { //перегрузка
        System.out.println();
    }
}

class Child extends Parent {
    void show(String str) { //переопределение
        System.out.println(str);
    }
}

//Статический полиморфизм - вызывается при компиляции кода
//(компилирует разные выполнения т.к. параметры методов различны)
//Динамический - вызывается в процессе выполнения программы

class Beast {
    void eat() {
        System.out.println("Животные питаются:");
    }
}
class herbivorous extends Beast {
    void eat() {
        System.out.println("Травоядные едят растения");
    }
}
class omnivorous extends Beast {
    void eat() {
        System.out.println("Всеядные едят растения и мясо");
    }
}
class carnivorous extends Beast {
    void eat() {
        System.out.println("Хищники едят только мясо");
    }
}