package Lessons.lesson06.AbstractTest;

class Plane extends Transport {
    private final int maxHeight;

    Plane(int vin, double price, int maxHeight) {
        super(vin, price);
        this.maxHeight = maxHeight;
    }

    //-----------------------------------------------
    void printVin() {
        System.out.println("VIN номер самолета: " + getVinNumber());
    }

    void printPrice() {
        System.out.println("Цена самолета: " + getPrice());
    }

    void maxHeight() {
        System.out.println("Максимальная высота полета: " + maxHeight);
    }
}
