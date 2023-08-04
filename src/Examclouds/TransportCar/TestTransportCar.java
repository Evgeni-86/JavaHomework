package Examclouds.TransportCar;

import Examclouds.TransportCar.Professions.Driver;
import Examclouds.TransportCar.Professions.Persons;
import Examclouds.TransportCar.Vehicles.LorryCar;

public class TestTransportCar {
    public static void main(String[] args) {
        LorryCar passengerCar1 = new LorryCar();
        Driver driver1 = new Driver();
        driver1.name = "Ivan";
        driver1.experience = 5;
        passengerCar1.driver = driver1;
        passengerCar1.toInfo();
    }
}
