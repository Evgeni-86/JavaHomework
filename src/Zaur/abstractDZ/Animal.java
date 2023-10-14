package Zaur.abstractDZ;

abstract public class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    abstract void eat();
    abstract void sleep();
}
