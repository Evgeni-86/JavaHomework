package solid;

class Animal{
}

class Cat extends Animal{

    public static void main(String[] args) {
        Animal animal = new Animal();
        Cat cat = new Cat();
        animal = cat;
    }
}