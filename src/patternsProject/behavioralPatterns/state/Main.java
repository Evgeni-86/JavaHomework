package patternsProject.behavioralPatterns.state;

public class Main {
    public static void main(String[] args) {
        Developer developer =new Developer();

        developer.setActivity(new Training());
        developer.justDoIt();

        developer.changeActivity();
        developer.justDoIt();

        developer.changeActivity();
        developer.justDoIt();
    }
}
