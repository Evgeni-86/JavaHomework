package Lessons.lesson08;

import java.util.ArrayList;

//Можно и не делать абстрактным если закрыть конструктор???
//или лучше абстрактный тогда от класса можно EXTENDS но зачем?
public class Garage {
    private static final ArrayList<Car> garageCar = new ArrayList<Car>();
    private static final ArrayList<Moto> garageMoto = new ArrayList<Moto>();
    private static final ArrayList<Velobike> garageVelo = new ArrayList<Velobike>();

    private Garage() {
    }

    static public <T> void add(T a) {
        if (a instanceof Car) {
            garageCar.add((Car) a);
        } else if (a instanceof Moto) {
            garageMoto.add((Moto) a);
        } else if (a instanceof Velobike) {
            garageVelo.add((Velobike) a);
        }
    }

    static public void printInfo() {
        print(garageCar, garageMoto, garageVelo);
    }

    static public void printEngineTransportInfo() {
        printEngine(garageCar, garageMoto);
    }

    @SafeVarargs
    static private void print(ArrayList<? extends Transport>... lists) {
        for (ArrayList<? extends Transport> list : lists) {
            for (Transport elem : list) {
                elem.printInfo();
            }
        }
    }

    //Получить конкретные данные
    @SafeVarargs
    static public void printEngine(ArrayList<? extends EngineTransportInfo>... Lists) {
        for (ArrayList<? extends EngineTransportInfo> list : Lists) {
                for (EngineTransportInfo elem : list) {
                    elem.printEngineInfo();
                }
        }
    }

}

class Test {
    public static void main(String[] args) {
        Car car1 = new Car("BMW", "diesel", "2.5l", true);
        Moto moto1 = new Moto("HONDA", "petrol", "0.6l");
        Velobike velo1 = new Velobike();
        Garage.add(car1);
        Garage.add(moto1);
        Garage.add(velo1);
        Garage.printInfo();
        System.out.println("==============================");
        Garage.printEngineTransportInfo();
    }
}