package Patterns.SimUDuck;

public class RedHeadDuck extends Duck {
    RedHeadDuck() {
        flyBehavior = new Behavior.FlyWithWings();
        quackBehavior = new Behavior.Quack();
    }

    @Override
    public void display() {
        System.out.println("This is RedHeadDuck");
    }
}
