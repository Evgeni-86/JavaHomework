package patternsProject.creationalPatterns.builder;

public class Car {
    String engine;

    public void setEngine(String engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine='" + engine + '\'' +
                '}';
    }
}
