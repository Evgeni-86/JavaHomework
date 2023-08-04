package Lessons.lesson06.AbstractTest;

abstract class Transport {
    private static double totalPriceTransport;
    private final int vinNumber;
    private double price;

    Transport(int vin, double price) {
        vinNumber = vin;
        totalPriceTransport += price;
    }

    //--------------------------------------------------------
    int getVinNumber() {
        return vinNumber;
    }

    double getPrice() {
        return price;
    }

    //-----------------------------------------------------------
    static void TotalPriceTransport() {
        System.out.println("Общая стоимость транспорта: " + totalPriceTransport);
    }
    //------------------------------------------------------------

    abstract void printVin();

    abstract void printPrice();
}
