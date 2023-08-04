package Examclouds.OPPShape;

public class TestShape {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        shapes[0] = new Circle("black", 4, 6);
        shapes[1] = new Rectangle("green", 7, 10);

        for (Shape elem : shapes) {
            elem.draw();
        }
    }
}

