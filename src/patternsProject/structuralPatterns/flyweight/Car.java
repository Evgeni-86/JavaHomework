package patternsProject.structuralPatterns.flyweight;

public class Car implements Transport{
    @Override
    public void drive() {
        System.out.println("a car is driving");
    }
}
