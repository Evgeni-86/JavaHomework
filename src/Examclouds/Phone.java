package Examclouds;

class Phone {
    private int number;
    String model;
    double weight;

    Phone(int number, String model, double weight) {
        this(number, model);
        this.weight = weight;
    }

    Phone(int number, String model) {
        this.number = number;
        this.model = model;
    }

    Phone() {
    }

    //----------------------------------------------------------
    void receiveCall(String name) {
        System.out.println("Звонит: " + name);
    }

    void receiveCall(String name, int number) {
        System.out.println("Звонит: " + name + ", Номер: " + number);
    }

    void sendMessage(int... args) {
        for (int elem : args) {
            System.out.println(elem);
        }
    }

    //--getters-------------------------------------------------
    public int getNumber() {
        return number;
    }
}

class TestPhone {
    public static void main(String[] args) {
        Phone phone1 = new Phone(456, "Nokia", 250);
        Phone phone2 = new Phone(789, "Samsung", 300);
        Phone phone3 = new Phone(321, "Aplle", 350);
        phone1.receiveCall("Jon", 45645878);
        phone1.sendMessage(456,9879,65656,977);
    }
}
