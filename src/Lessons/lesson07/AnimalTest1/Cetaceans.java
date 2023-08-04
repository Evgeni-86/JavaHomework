package Lessons.lesson07.AnimalTest1;

public abstract class Cetaceans extends Mammal implements Swimming{
    @Override
    public void swimming() {
        System.out.println("Китообразный плывет");
    }
}
