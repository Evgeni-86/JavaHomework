package Examclouds.Cloth;

public class Tie extends Clothes implements MenClothes{

    public Tie(String type, Size size, double price, String color) {
        super(type, size, price, color);
    }

    @Override
    public void dressMan() {
    }
}
