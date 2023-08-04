package Lessons.lesson06.InterfacesTest;

public class Main {
    public static void main(String[] args) {
        Human person1 = new Human("Ivan", "Ivanov", 25);
        Dog dog1 = new Dog("Dog", 5);

        //обьект ограничен методами интерфейса
        Walk person2 = new Human("Petr","Petrov",50);

        walk(person1, dog1);
        person1.info();
        dog1.info();

        drive(person1);
    }

    static void walk(Walk objOne, Walk objTwo) {
        objOne.walk(10);
        objTwo.walk(50);
    }

    static void drive(Drive objOne) {
        objOne.drive();
    }
}
