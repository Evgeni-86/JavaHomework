package Lessons.lesson08;

public class Car extends Transport implements EngineTransportInfo{

    protected boolean trailer;
    protected String engineType;
    protected String engineVolume;

    Car(String model, String engineType, String engineVolume, boolean trailer) {
        this.model = model;
        this.trailer = trailer;
        this.engineType = engineType;
        this.engineVolume = engineVolume;
    }

    @Override
    public void printInfo() {
        System.out.println("model Car: " + this.model + ", trailer: "+ trailer);
    }

    @Override
    public void printEngineInfo() {
        printInfo();
        System.out.println("engine type: " + this.engineType + ", volume: " + this.engineVolume);
        System.out.println("--------------------------------");
    }
}


