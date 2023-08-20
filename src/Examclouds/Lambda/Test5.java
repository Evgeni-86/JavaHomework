package Examclouds.Lambda;

public class Test5 {
    public static void main(String[] args) {
        Car5 car5 = new Car5(CarType.SPORT, 40000);
        car5.doSome();

        Sorted3 sorted3 = (elem) -> elem.cost > 1000;

        car5.test(sorted3);
    }

}

interface Sorted3 {
    boolean sort(Car5 car);

    default void doSome() {};
}


class Car5 implements Sorted3{
    CarType type;
    int cost;

    public Car5(CarType type, int cost) {
        this.type = type;
        this.cost = cost;
    }

    @Override
    public boolean sort(Car5 car) {
        return false;
    }

    @Override
    public void doSome() {
        System.out.println("this default metod");
    }

    @Override
    public String toString() {
        return "Car{" +
                "type=" + type +
                ", cost=" + cost +
                '}';
    }

    public void test(Sorted3 sorted3){
        if (sorted3.sort(this)){
            System.out.println("true");
        }
    }
}

