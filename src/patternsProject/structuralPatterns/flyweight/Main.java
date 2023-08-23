package patternsProject.structuralPatterns.flyweight;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        TransportFactory transportFactory = new TransportFactory();

        ArrayList<Transport> transports = new ArrayList<>();

        transports.add(transportFactory.getTransport("car"));
        transports.add(transportFactory.getTransport("car"));
        transports.add(transportFactory.getTransport("car"));
        transports.add(transportFactory.getTransport("car"));
        transports.add(transportFactory.getTransport("track"));
        transports.add(transportFactory.getTransport("track"));
        transports.add(transportFactory.getTransport("track"));
        transports.add(transportFactory.getTransport("track"));
        transports.add(transportFactory.getTransport("track"));

        transports.forEach(elem -> elem.drive());
    }
}
