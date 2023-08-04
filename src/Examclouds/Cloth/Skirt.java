package Examclouds.Cloth;

public class Skirt extends Clothes implements WomenClothes{

    public Skirt(String type, Size size, double price, String color) {
        super(type, size, price, color);
    }

    @Override
    public void dressWomen() {
    }
}
