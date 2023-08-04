package Lessons.lesson06.InterfacesTest2;

class Plane extends Transport {
    public void fly() {
        System.out.println("Полет");
    }

    @Override
    public void speedUp() {
        System.out.println("Ускорение самолета");
    }

    @Override
    public void speedDown() {
        System.out.println("Замедление самолета");
    }
}
