package patternsProject.creationalPatterns.builder.builder1;

public class EngineV6CarBuilder extends CarBuilder{
    @Override
    void buildEngine() {
        car.setEngine("V6");
    }
}
