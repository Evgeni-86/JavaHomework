package patternsProject.creationalPatterns.abstractFactory;

public class Main {
    public static void main(String[] args) {
        CarFactory factory = new FordFactory();
        Sedan sedan = factory.createSedan();
    }
}
