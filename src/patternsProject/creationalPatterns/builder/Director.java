package patternsProject.creationalPatterns.builder;

public class Director {
    CarBuilder carBuilder;

    public void setBuilder(CarBuilder carBuilder) {
        this.carBuilder = carBuilder;
    }

    Car createdCar(){
        carBuilder.createCar();
        carBuilder.buildEngine();
        return carBuilder.getCar();
    }

}
