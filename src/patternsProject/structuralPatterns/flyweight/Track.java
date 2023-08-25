package patternsProject.structuralPatterns.flyweight;

public class Track implements Transport{
    @Override
    public void drive() {
        System.out.println("a track is driving");
    }
}
