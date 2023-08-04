package Lessons.lesson06.InterfacesTest2;

class Boeing extends Plane implements Flight {

    public void releaseChassis() {
        System.out.println("Выпустить шасси");
    }

    public void removeChassis() {
        System.out.println("Убрать шасси");
    }
}
