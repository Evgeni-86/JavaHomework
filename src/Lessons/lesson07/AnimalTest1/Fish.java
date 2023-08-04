package Lessons.lesson07.AnimalTest1;

public abstract class Fish extends Animal implements Swimming{

    @Override
    public void swimming() {
        System.out.println("Рыба плывет");
    }
}
