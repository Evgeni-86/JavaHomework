package patternsProject.structuralPatterns.bridge;

public class ProductOne implements Product{
    String name = "ONE";

    @Override
    public String showType() {
        return name;
    }
}
