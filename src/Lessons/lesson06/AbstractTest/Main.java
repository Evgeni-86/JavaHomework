package Lessons.lesson06.AbstractTest;

public class Main {
    public static void main(String[] args) {
        Car newCar1 = new Car(985, 150.15, true);
        Plane newPlane1 = new Plane(45645, 80.56, 5000);

        Transport.TotalPriceTransport();

        newPlane1.printPrice();
        newPlane1.maxHeight();
        newCar1.printVin();
        newCar1.trailer();

    }
}
