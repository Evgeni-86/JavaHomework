package Examclouds.Lambda;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Test4 {
    public static void main(String[] args) {
        Car3[] cars = new Car3[]{
                new Car3(CarType.COMPACT, 34000, 100000),
                new Car3(CarType.SPORT, 44000, 200000),
                new Car3(CarType.COMPACT, 14000, 300000),
                new Car3(CarType.COMPACT, 10000, 400000)
        };


        Predicate<Car3> car3Predicate = (elem) -> elem.cost > 15000; //boolean
        //----SUPPLIER-----------------------------------------------------------
        Supplier<Car3> car3SupplierType = () -> cars[0]; //вернет Обьект
        Supplier<Car3> car3SupplierProfit = () -> new Car3(CarType.SPORT, 30000, 0); //вернет Обьект
        Car3 newCar3 = newCar3Created(() -> cars[0]);
        //----CONSUMER-----------------------------------------------------------
        Consumer<Car3> car3Consumer = (elem) ->  elem.cost = 20000; //что-то сделает с обьектом
        changeCar(cars[0], car3Consumer);
        System.out.println(cars[0]);
        changeCar(cars[0], (elem) ->  elem.cost = 5000);
        System.out.println(cars[0]);
        //----FUNCTION-----------------------------------------------------------
        Function<Car3, Integer> car3FunctionAllCost = (elem) -> elem.cost; //вернуть другой обьект
        Function<Car3, Integer> car3FunctionAllProfit = (elem) -> elem.profit; //вернуть другой обьект
        Function<Car3, CarType> car3FunctionAllType = (elem) -> elem.type; //вернуть другой обьект
        System.out.println("----COST-------------------------------");
        System.out.println(integersInfo(cars, car3FunctionAllCost));
        System.out.println("----PROFIT-----------------------------");
        System.out.println(integersInfo(cars, car3FunctionAllProfit));
    }

    public static Car3 newCar3Created(Supplier<Car3> supplier){
        return supplier.get();
    }

    public static void changeCar(Car3 car, Consumer<Car3> consumer){
        consumer.accept(car);
    }

    public static int integersInfo(Car3[] cars, Function<Car3, Integer> function){
        int sum  = 0;
        for (Car3 car : cars) {
            sum += function.apply(car);
        }
        return sum;
    }


}


class Car3 {
    CarType type;
    int cost;
    int profit;

    public Car3(CarType type, int cost, int profit) {
        this.type = type;
        this.cost = cost;
        this.profit = profit;
    }

    @Override
    public String toString() {
        return "Car{" +
                "type=" + type +
                ", cost=" + cost +
                '}';
    }
}
