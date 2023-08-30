package patternsProject.creationalPatterns.builder.builder2;

public interface BuilderInterface {

    void buildPart1(String model);
    void buildPart2(String engine);
    void buildPart3(String type);

    void get();
}
