package Examclouds.OPPShape;

public class Circle extends Shape {

    private int coordinateX;
    private int coordinateY;

    public Circle(String color, int coordinateX, int coordinateY) {
        super(color);
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
    }

    @Override
    public void draw() {
        System.out.println("paint Circle");
    }
}
