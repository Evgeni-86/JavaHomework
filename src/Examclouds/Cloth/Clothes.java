package Examclouds.Cloth;

import java.lang.reflect.Type;

public abstract class Clothes {
    private String type;
    private Size size;
    private double price;
    private String color;

    public Clothes(String type, Size size, double price, String color) {
        this.type = type;
        this.size = size;
        this.price = price;
        this.color = color;
    }

    public void info() {
        System.out.println("Название: " + type + ", " + "цвет: " + color + ", " + "размер: " + size + ", " + "цена: " + color);
    }

}
