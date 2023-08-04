package Patterns.SimUDuck;

public class TestSimUDuck {
    public static void main(String[] args) {
        MallardDuck mallardDuck = new MallardDuck();
        mallardDuck.performQuack();

        ModelDuck modelDuck = new ModelDuck();
        modelDuck.performFly();
        modelDuck.setFlyBehavior(new Behavior.FlyRocketPowered());
        modelDuck.performFly();
    }
}
