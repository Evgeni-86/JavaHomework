package patternsProject.structuralPatterns.decorator;

public class Main {
    public static void main(String[] args) {
        PersonWalk personWalk = new PersonWalk();
        System.out.println(personWalk.doSome());

        PersonDecorator personDecorator = new PersonDrive(new PersonWalk());
        System.out.println(personDecorator.doSome());

        PersonDecorator personDecorator1 = new PersonSwim(new PersonDrive(new PersonWalk()));
        System.out.println(personDecorator1.doSome());
    }

}
