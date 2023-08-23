package patternsProject.behavioralPatterns.visitor;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Cat 1");
        Dog dog = new Dog("Dog 1");

        Visitor actionCat = new ActionVisitor();
        Visitor soundCat = new SoundVisitor();

        cat.accept(actionCat);
        cat.accept(soundCat);
    }
}
