package Lessons.lesson07.AnimalTest1;

public class Main {
    public static void main(String[] args) {
        Dolphin dolphin = new Dolphin();
        dolphin.wayOfBirth();
        dolphin.swimming();

        Eagle eagle = new Eagle();
        eagle.eat();
        eagle.flying();

        Bat bat = new Bat();
        bat.flying();
        bat.wayOfBirth();
    }
}
