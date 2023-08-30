package patternsProject.creationalPatterns.builder.builder1;

public class EngineV12CarBuilder extends CarBuilder{
    @Override
    void buildEngine() {
        car.setEngine("V12");
    }
}
