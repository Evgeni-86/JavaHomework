package patternsProject.creationalPatterns.factoryMethod;

public class CarCreator extends TransportCreator{
    @Override
    public Car createTransport() {
        return new Car();
    }
}
