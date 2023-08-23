package patternsProject.behavioralPatterns.visitor;

public class ActionVisitor implements Visitor{

    public void visitCat(Cat cat) {
        System.out.println("Cat" + cat + " play...");
    }

    public void visitDog(Dog dog) {
        System.out.println("Dog " + dog + " walk...");
    }

}
