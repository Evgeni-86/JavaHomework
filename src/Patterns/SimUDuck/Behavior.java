package Patterns.SimUDuck;

public abstract class Behavior {

    static class FlyWithWings implements FlyBehavior {
        @Override
        public void fly() {
            System.out.println("I can fly");
        }
    }

    static class FlyNoWay implements FlyBehavior {
        @Override
        public void fly() {
            System.out.println("I don`t can fly");
        }
    }

    static class FlyRocketPowered implements FlyBehavior {
        public void fly() {
            System.out.println("I’m flying with a rocket!");
        }
    }
//-----------------------------------------------------------------
    static class Quack implements QuackBehavior {
        @Override
        public void quack() {
            System.out.println("Duck can quack");
        }
    }

    static class MuteQuack implements QuackBehavior {
        @Override
        public void quack() {
            System.out.println("Can`t quack");
        }
    }

}


