package patternsProject.structuralPatterns.flyweight;

import java.util.HashMap;

public class TransportFactory {
    private static final HashMap<String, Transport> transports = new HashMap<>();

    public Transport getTransport(String typeCar){

        Transport transport = transports.get(typeCar);

        if (transport == null){
            switch (typeCar){
                case "car":
                    System.out.println("created transport car");
                    transport = new Car();
                    break;
                case "track":
                    System.out.println("created transport track");
                    transport = new Track();
                    break;
            }
            transports.put(typeCar, transport);
        }
        return transport;
    }
}
