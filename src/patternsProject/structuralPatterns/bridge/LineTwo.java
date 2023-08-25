package patternsProject.structuralPatterns.bridge;

public class LineTwo extends Line {

    public LineTwo(Product product) {
        super(product);
    }

    @Override
    protected void createdProductInfo() {
        System.out.println("LoneTwo created product " + product.showType());
    }
}
