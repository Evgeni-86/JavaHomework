package Lessons.lesson08;

public class Moto extends Transport implements EngineTransportInfo {

    protected String engineType;
    protected String engineVolume;

    Moto(String model, String engineType, String engineVolume) {
        this.model = model;
        this.engineType = engineType;
        this.engineVolume = engineVolume;
    }

    @Override
    public void printInfo() {
        System.out.println("model Moto: " + this.model);
    }

    @Override
    public void printEngineInfo() {
        printInfo();
        System.out.println("engine type: " + this.engineType + ", volume: " + this.engineVolume);
        System.out.println("--------------------------------");
    }
}
