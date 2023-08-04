package Examclouds.TransportCar.Vehicles;

import Examclouds.TransportCar.Details.Engine;
import Examclouds.TransportCar.Professions.Driver;

public abstract class Car {
    public String model;
    public String carClass;
    public int weight;
    public Driver driver;
    public Engine engine;

    public void start() {
        System.out.println("Car start");
    }
    public void stop() {
        System.out.println("Car stop");
    }
    public void turnRight() {
        System.out.println("Car turn right");
    }
    public void turnLeft() {
        System.out.println("Car turn left");
    }

    public void toInfo() {
        String format = "Driver: %s \nModel car: %s | Class car: %s | Engine: %s";
        System.out.printf(format, this.driver.toString(), this.model, this.carClass, this.engine);
    }
}

//марка автомобиля, класс автомобиля, вес, водитель типа Driver,
// мотор типа Engine. Методы start(), stop(), turnRight(), turnLeft(),
// которые выводят на печать: "Поехали", "Останавливаемся", "Поворот
// направо" или "Поворот налево". А также метод toString(), который
// выводит полную информацию об автомобиле, ее водителе и моторе.