package patternsProject.creationalPatterns.builder;

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
