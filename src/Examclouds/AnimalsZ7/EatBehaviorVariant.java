package Examclouds.AnimalsZ7;

public abstract class EatBehaviorVariant {

    static class AnimalEat implements EatBehavior {
        public void eat() {
            System.out.println("Animal eat");
        }
    }

    static class AnimalNoEat implements EatBehavior {
        public void eat() {
            System.out.println("Animal not eat");
        }
    }

}
