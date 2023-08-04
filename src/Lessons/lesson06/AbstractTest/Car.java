package Lessons.lesson06.AbstractTest;

class Car extends Transport {
    private boolean trailer;

    Car(int vin, double price, boolean trailer) {
        super(vin, price);
        this.trailer = trailer;
    }

    //-----------------------------------------------------
    void printVin() {
        System.out.println("VIN номер автомобиля: " + getVinNumber());
    }

    void printPrice() {
        System.out.println("Цена автомобиля: " + getPrice());
    }

    void trailer() {
        System.out.println("Прицеп: " + trailer);
    }
}
