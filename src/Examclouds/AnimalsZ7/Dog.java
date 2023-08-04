package Examclouds.AnimalsZ7;

public class Dog extends Animal {
    protected String type = "Dog";
    protected boolean owner;

    Dog(String name, boolean owner) {
        super(name, new NoiseBehaviorVariant.AnimalBark(),
                new EatBehaviorVariant.AnimalNoEat());
        this.owner = owner;
    }

    @Override
    public void getDescript() {
        System.out.println(name + " " + type + " " + owner);
    }
}
