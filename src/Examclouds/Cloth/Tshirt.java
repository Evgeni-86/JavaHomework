package Examclouds.Cloth;

public class Tshirt extends Clothes implements MenClothes,WomenClothes {

    public Tshirt(String type, Size size, double price, String color) {
        super(type, size, price, color);
    }

    @Override
    public void dressMan() {

    }

    @Override
    public void dressWomen() {

    }
}
