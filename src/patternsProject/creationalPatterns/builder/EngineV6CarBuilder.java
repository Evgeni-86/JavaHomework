package patternsProject.creationalPatterns.builder;

public class EngineV6CarBuilder extends CarBuilder{
    @Override
    void buildEngine() {
        car.setEngine("V6");
    }
}
