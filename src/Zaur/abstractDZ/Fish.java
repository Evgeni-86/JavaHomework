package Zaur.abstractDZ;

abstract public class Fish extends Animal {

    public Fish(String name) {
        super(name);
    }

    @Override
    void sleep() {
        System.out.println("всегда интересно наблюдать как спят рыбы");
    }

    abstract void swim();
}
