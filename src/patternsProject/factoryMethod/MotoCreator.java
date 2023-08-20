package patternsProject.factoryMethod;

public class MotoCreator extends TransportCreator{
    @Override
    public Transport createTransport() {
        return new Moto();
    }
}
