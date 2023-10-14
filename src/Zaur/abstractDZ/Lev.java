package Zaur.abstractDZ;

public class Lev extends Mammal{
    public Lev(String name) {
        super(name);
    }

    @Override
    void eat() {
        System.out.println("лев как любой хищьник любит мясо");
    }

    @Override
    void sleep() {
        System.out.println("большую часть дня лев спит");
    }

    @Override
    void run() {
        System.out.println("лев - это не самая быстрая кошка");
    }
}
