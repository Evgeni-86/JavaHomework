package patternsProject.creationalPatterns.builder.builder2;

public class CarBuilder implements BuilderInterface {

    private Car car = new Car();


    public void get() {

    }


    @Override
    public void buildPart1(String model) {
        car.setModel(model);
    }

    @Override
    public void buildPart2(String engine) {
        car.setEngine(engine);
    }

    @Override
    public void buildPart3(String type) {
        car.setType(type);
    }
}
