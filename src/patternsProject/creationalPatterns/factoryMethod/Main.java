package patternsProject.creationalPatterns.factoryMethod;

public class Main {

    public static void main(String[] args) {
        TransportCreator transportCreator = createTransportType("moto");
        Transport transport = transportCreator.createTransport();
        transport.showInfo();

    }

    private static TransportCreator createTransportType(String type){
        if (type.equalsIgnoreCase("car")){
            return new CarCreator();
        }
        if (type.equalsIgnoreCase("moto")){
            return new MotoCreator();
        }
        throw new RuntimeException(type + " типа транспорта нет");
    }

}


