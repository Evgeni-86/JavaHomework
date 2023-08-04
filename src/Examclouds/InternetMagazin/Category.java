package Examclouds.InternetMagazin;

public class Category  {
    private String name;
    private Product[] catalog;

    public Category(String name, Product[] catalog) {
        this.name = name;
        this.catalog = catalog;
    }

    public String getName() {
        return name;
    }

    public Product[] getCatalog() {
        return catalog;
    }
}
