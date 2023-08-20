package Examclouds.Lambda;

import java.io.IOException;
import java.util.function.Predicate;

public class Test2 {
    public static void main(String[] args) {
        //СДЕЛАТЬ ВЫБОРКУ ПО ТИПУ И ЦЕНЕ БЕЗ ЛЯМБДА И С ЛЯМБДА
        //ВОПРОС КАК ЛУЧШЕ СРАВНИВАТЬ ПЕРЕЧИСЛЯЕМЫЕ ТИПЫ???????????????
        //МОЖЕТ ВЫСКОЧИТЬ NullPointerException ПРИ СРАВНЕНИИ == ЕСЛИ ENUM-КОНСТАНТА
        //ЕСЛИ У CAR ПОЛЕ CarType = NULL???
        //ФУНКЦИОНАЛЬНЫЙ ИНТЕРФЕЙС С МЕТОДАМИ default - зачем???
        Car[] cars = new Car[]{
                new Car(CarType.COMPACT, 34000),
                new Car(CarType.SPORT, 44000),
                new Car(CarType.COMPACT, 14000),
                new Car(CarType.COMPACT, 10000)
        };

        typeCarSort(cars);
        System.out.println("-----------------------------");
        costCarSort(cars);
        System.out.println("-----------------------------");
        sortedCar(cars, new TypeCarsCompact());
        System.out.println("-----------------------------");
        sortedCar(cars, new CostCars());
        System.out.println("----SORTED LAMBDA------------");
        SortedLambda sortTypeCompact = (elem) -> elem.type == CarType.COMPACT;
        boolean rez = sortTypeCompact.sortLambda(cars[0]);
        sortedCarLambda(cars, sortTypeCompact);
        System.out.println("-----------------------------");
        SortedLambda sortCost = (elem) -> elem.cost > 15000;
        sortedCarLambda(cars, sortCost);

        //---ПРИМЕР АНАНИМНОГО КЛАССА ДЛЯ СОРТИРОВКА-------
        System.out.println("----SORTED ABSTRACT CLASS-----");
        Sorted typeCarSort = new Sorted() {
            @Override
            public boolean sort(Car car) {
                return car.type.equals(CarType.COMPACT);
            }
        };
        sortedCar(cars, typeCarSort);

        System.out.println("------------------------------");
        Sorted costCarSort = new Sorted() {
            @Override
            public boolean sort(Car car) {
                return car.cost > 15000;
            }
        };
        sortedCar(cars, costCarSort);
    }

    //---ЧЕРЕЗ LAMBDA----------------------------------
    public static void sortedCarLambda(Car[] cars, SortedLambda sorted) {
        for (int i = 0; i < cars.length; i++) {
            if (sorted.sortLambda(cars[i])) {
                System.out.println(cars[i]);
                sorted.info();
            }
        }
    }

    //СОРТИРОВКА ЧЕРЕЗ ОДИН МЕТОД С РАЗНЫМИ КЛАССАМИ СОРТИРОВОК
    public static void sortedCar(Car[] cars, Sorted sorted) {
        for (int i = 0; i < cars.length; i++) {
            if (sorted.sort(cars[i])) {
                System.out.println(cars[i]);
            }
        }
    }

    //СОРТИРОВКА ЧЕРЕЗ ОТДЕЛЬНЫЕ МЕТОДЫ
    public static void typeCarSort(Car[] cars) {
        for (int i = 0; i < cars.length; i++) {
            if (cars[i].type == CarType.COMPACT) {
                System.out.println(cars[i]);
            }
        }
    }

    public static void costCarSort(Car[] cars) {
        for (int i = 0; i < cars.length; i++) {
            if (cars[i].cost > 15000) {
                System.out.println(cars[i]);
            }
        }
    }

}

//--------СОРТИРОВКА ЛЯМБДА-----------------------------------------
@FunctionalInterface
interface SortedLambda {
    boolean sortLambda(Car car);
    default void info(){
        System.out.println("AAA");
    }
    String toString(); //МЕТОДЫ OBJECT
}

//------------------------------------------------------------------
interface Sorted {
    boolean sort(Car car);
}

//--------КЛАСС ДЛЯ КАЖДОГО ТИПА СОРТИРОВКИ-------------------------
class TypeCarsCompact implements Sorted {
    @Override
    public boolean sort(Car car) {
        return car.type == CarType.COMPACT;
    }
}

class CostCars implements Sorted {
    @Override
    public boolean sort(Car car) {
        return car.cost > 15000;
    }
}

//------------------------------------------------------------------
class Car {
    CarType type;
    int cost;

    public Car(CarType type, int cost) {
        this.type = type;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Car{" +
                "type=" + type +
                ", cost=" + cost +
                '}';
    }
}

//------------------------------------------------------------------
enum CarType {
    COMPACT, SPORT,
}



