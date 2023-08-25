package patternsProject.structuralPatterns.composite;

public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop();
        ShopDepartmentTool shopDepartmentTool = new ShopDepartmentTool();
        ShopDepartmentBook shopDepartmentBook = new ShopDepartmentBook();

        ProductTool tool1 = new ProductTool();
        ProductTool tool2 = new ProductTool();

        ProductBook book1 = new ProductBook();
        ProductBook book2 = new ProductBook();

        shopDepartmentTool.add(tool1);
        shopDepartmentTool.add(tool2);

        shopDepartmentBook.add(book1);
        shopDepartmentBook.add(book2);

        shop.add(shopDepartmentTool);
        shop.add(shopDepartmentBook);

        shop.operation();
    }
}
