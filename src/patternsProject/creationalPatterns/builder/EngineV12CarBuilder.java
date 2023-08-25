package patternsProject.creationalPatterns.builder;

public class EngineV12CarBuilder extends CarBuilder{
    @Override
    void buildEngine() {
        car.setEngine("V12");
    }
}
