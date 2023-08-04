package Examclouds.TransportCar.Professions;

public class Driver extends Persons {
    public int experience;

    @Override
    public String toString() {
        return name + " Стаж: " + experience;
    }
}
