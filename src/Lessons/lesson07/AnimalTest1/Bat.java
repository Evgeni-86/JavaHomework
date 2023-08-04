package Lessons.lesson07.AnimalTest1;

public class Bat extends Bats implements Flying {

    @Override
    public void flying() {
        System.out.println("Летучая мышь летит");
    }
}
