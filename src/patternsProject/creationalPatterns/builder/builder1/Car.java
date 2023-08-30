package patternsProject.creationalPatterns.builder.builder1;

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
