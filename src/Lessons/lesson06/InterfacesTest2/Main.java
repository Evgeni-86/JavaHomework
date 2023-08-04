package Lessons.lesson06.InterfacesTest2;

public class Main {
    public static void main(String[] args) {
        Boeing boeing747 = new Boeing();
        tO(boeing747);
        fL(boeing747);
    }

    static void tO(Takeoff obj) { //Ограничен методами интерфейса Takeoff
        obj.speedUp();
        obj.removeChassis();
    }
    static void fL(Flight obj) { //Ограничен методами интерфейса Flight
        obj.fly();
    }
    static void lA(Landing obj) { //Ограничен методами интерфейса Landing
        obj.speedDown();
        obj.releaseChassis();
    }
}
