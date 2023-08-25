package patternsProject.structuralPatterns.bridge;

public class ProductTwo implements Product{
    String name = "TWO";

    @Override
    public String showType() {
        return name;
    }
}
