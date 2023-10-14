package Zaur.abstractDZ;

abstract public class Bird extends Animal implements Speakable{

    public Bird(String name) {
        super(name);
    }

    abstract void fly();

    @Override
    public void speak() {
        System.out.println(name + " sings");
    }
}
