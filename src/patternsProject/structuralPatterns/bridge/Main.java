package patternsProject.structuralPatterns.bridge;

public class Main {
    public static void main(String[] args) {
        LineOne production1 = new LineOne(new ProductTwo());
        LineTwo production2 = new LineTwo(new ProductOne());
        production1.createdProductInfo();
        production2.createdProductInfo();
    }
}
