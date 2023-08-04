package Examclouds.Cloth;

public class Trousers extends Clothes implements MenClothes, WomenClothes {

    public Trousers(String type, Size size, double price, String color) {
        super(type, size, price, color);
    }

    @Override
    public void dressMan() {
    }

    @Override
    public void dressWomen() {
    }
}
