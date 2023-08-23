package patternsProject.creationalPatterns.singleton;

public class Main {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getSingleton();

        singleton.addString("AAAAAAAAAAAA");
        singleton.addString("BBBBBBBBBB");

        singleton.showStrings();
    }
}
