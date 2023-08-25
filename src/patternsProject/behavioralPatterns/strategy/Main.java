package patternsProject.behavioralPatterns.strategy;

public class Main {
    public static void main(String[] args) {
        Developer developer =new Developer();

        developer.setActivity(new Training());
        developer.justDoIt();

        developer.setActivity(new Sleep());
        developer.justDoIt();

        developer.setActivity(new Read());
        developer.justDoIt();
    }
}
