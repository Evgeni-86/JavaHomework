package Examclouds.AnimalsZ7;

public class TestAnimalZ7 {
    public static void main(String[] args) {
        Animal[] animalArr = {new Dog("Jack", true), new Dog("Bob", false)};
        vetDoctor(animalArr);
        info(animalArr);
    }

    static void info(Animal[] arr) {
        for (Animal elem : arr) {
            elem.getDescript();
            elem.noise.noise();
            elem.eat.eat();
        }
    }

    static void vetDoctor(Animal[] arr) {
        for (Animal elem : arr) {
            Vet.treatAnimal(elem);
        }
    }
}
