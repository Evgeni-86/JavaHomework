package patternsProject.creationalPatterns.builder.builder1;

public abstract class CarBuilder {
    Car car;

    void createCar(){
        car = new Car();
    }

    abstract void buildEngine();

    Car getCar(){
        return car;
    }
}
