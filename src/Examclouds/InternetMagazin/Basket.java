package Examclouds.InternetMagazin;

import java.util.LinkedList;

public class Basket {
    private LinkedList<Product> products = new LinkedList<>();

    public void addProducts(int number, Category category) {
        Product productindex = category.getCatalog()[number - 1];
        this.products.addLast(productindex);
    }

    public LinkedList<Product> getBasket() {
        return products;
    }
}
