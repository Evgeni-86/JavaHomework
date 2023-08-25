package Examclouds.Lambda;

public class Test3 {
    public static void main(String[] args) {

        Car2 carAnonymous = new Car2(CarType.SPORT, 5000){
            public void info(){
                System.out.println("newAnonymousCar");
            }
        };

        carAnonymous.info();
    }
}


class Car2 {
    CarType type;
    int cost;

    public Car2(CarType type, int cost) {
        this.type = type;
        this.cost = cost;
    }

    public void info(){

    }

    @Override
    public String toString() {
        return "Car{" +
                "type=" + type +
                ", cost=" + cost +
                '}';
    }
}

