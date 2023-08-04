package Lessons.lesson07.AnimalTest1;

public class Eagle extends Bird implements Flying {

    @Override
    public void flying() {
        System.out.println("орел летит");
    }
}
