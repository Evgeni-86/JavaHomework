package Patterns.SimUDuck;

public class MallardDuck extends Duck {
    MallardDuck() {
        flyBehavior = new Behavior.FlyWithWings();
        quackBehavior = new Behavior.Quack();
    }

    @Override
    public void display() {
        System.out.println("This is MallardDuck");
    }
}
