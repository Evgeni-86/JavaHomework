package patternsProject.behavioralPatterns.visitor;

public class Cat implements Animal{
    String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitCat(this);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
