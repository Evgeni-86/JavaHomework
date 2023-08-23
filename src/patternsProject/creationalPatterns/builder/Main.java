package patternsProject.creationalPatterns.builder;

public class Main {
    public static void main(String[] args) {
        Director factory = new Director();

        factory.setBuilder(new EngineV12CarBuilder());
        Car carV12 = factory.createdCar();
        System.out.println(carV12.toString());

        factory.setBuilder(new EngineV6CarBuilder());
        Car carV6 = factory.createdCar();
        System.out.println(carV6.toString());
    }
}
