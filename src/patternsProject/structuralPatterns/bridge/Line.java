package patternsProject.structuralPatterns.bridge;

public abstract class Line {
    protected Product product;

    protected Line(Product product) {
        this.product = product;
    }

    protected abstract void createdProductInfo();
}
