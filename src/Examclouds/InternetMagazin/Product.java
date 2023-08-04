package Examclouds.InternetMagazin;

public class Product {
    private String name;
    private double prise;
    private int rating;

    public Product(String name, double prise, int rating) {
        this.name = name;
        this.prise = prise;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrise() {
        return prise;
    }

    public int getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", prise=" + prise +
                ", rating=" + rating +
                '}';
    }
}
