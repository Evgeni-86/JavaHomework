package Patterns.SimUDuck;

public class ModelDuck extends Duck {
    ModelDuck() {
        flyBehavior = new Behavior.FlyNoWay();
        quackBehavior = new Behavior.Quack();
    }

    @Override
    public void display() {
        System.out.println("This is ModelDuck");
    }

}
