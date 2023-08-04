package Examclouds.AnimalsZ7;

public abstract class NoiseBehaviorVariant {

    static class AnimalBark implements NoiseBehavior {
        public void noise() {
            System.out.println("Bark");
        }
    }

    static class AnimalMay implements NoiseBehavior {
        public void noise() {
            System.out.println("May");
        }
    }

    static class AnimalGrowl implements NoiseBehavior {
        public void noise() {
            System.out.println("Growl");
        }
    }

    static class AnimalNoNoise implements NoiseBehavior {
        public void noise() {
            System.out.println("not noise");
        }
    }

}
