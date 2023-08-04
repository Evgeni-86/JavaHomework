package Examclouds.OPPShape;

public class Rectangle extends Shape{

    private int coordinateX;
    private int coordinateY;

    public Rectangle(String color, int coordinateX, int coordinateY) {
        super(color);
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
    }

    @Override
    public void draw() {
        System.out.println("paint Rectangle");
    }
}
