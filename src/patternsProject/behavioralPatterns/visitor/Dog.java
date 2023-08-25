package patternsProject.behavioralPatterns.visitor;

public class Dog implements Animal{
    String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitDog(this);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}
