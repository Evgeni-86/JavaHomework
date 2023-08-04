package Examclouds.InternetMagazin;

import java.util.ArrayList;

public class ProductBase {

    private ProductBase(){}

    static Product book1 = new Product("Book1", 10.5, 5);
    static Product book2 = new Product("Book2", 9.2, 4);
    static Product toy1 = new Product("Toy1", 12.2, 6);
    static Product toy2 = new Product("Toy2", 14.3, 3);
    static Product tools1 = new Product("Tools1", 8.2, 4);
    static Product tools2 = new Product("Tools2", 18.1, 7);

    static Category categoryBooks = new Category("Books", new Product[]{book1, book2});
    static Category categoryToys = new Category("Toys", new Product[]{toy1, toy2});
    static Category categoryTools = new Category("Tools", new Product[]{tools1, tools2});

    static public Category getCategoryBooks() {
        return categoryBooks;
    }

    static public Category getCategoryToys() {
        return categoryToys;
    }

    static public Category getCategoryTools() {
        return categoryTools;
    }
}
