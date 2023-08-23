package patternsProject.behavioralPatterns.visitor;

public class SoundVisitor implements Visitor {
    @Override
    public void visitCat(Cat cat) {
        System.out.println("Cat" + cat + " may...");
    }

    @Override
    public void visitDog(Dog dog) {
        System.out.println("Dog " + dog + " bark...");
    }
}
