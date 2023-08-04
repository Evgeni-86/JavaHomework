package Examclouds.AnimalsZ7;

public abstract class Animal {
    protected String name;
    protected NoiseBehavior noise;
    protected EatBehavior eat;

    Animal(String name, NoiseBehavior noise, EatBehavior eat) {
        this.name = name;
        this.noise = noise;
        this.eat = eat;
    }

    public void setNoise(NoiseBehavior noise) {
        this.noise = noise;
    }

    public void setEat(EatBehavior eat) {
        this.eat = eat;
    }

    public abstract void getDescript();
}
