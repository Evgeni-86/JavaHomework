package Zaur.abstractDZ;

public class Pingvin extends Bird{
    public Pingvin(String name) {
        super(name);
    }

    @Override
    void eat() {
        System.out.println("пингвин любит есть рыбу");
    }

    @Override
    void sleep() {
        System.out.println("пингвины спят прижавшись друг к другу");
    }

    @Override
    void fly() {
        System.out.println("пингвины не умеют летать");
    }

    @Override
    public void speak() {
        System.out.println("пингвины не умеют петь как соловьи");
    }
}
