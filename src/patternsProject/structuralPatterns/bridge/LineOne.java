package patternsProject.structuralPatterns.bridge;

public class LineOne extends Line {

    public LineOne(Product product) {
        super(product);
    }

    @Override
    protected void createdProductInfo() {
        System.out.println("LoneOne created product " + product.showType());
    }
}
