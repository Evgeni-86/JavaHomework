package patternsProject.creationalPatterns.singleton;

import java.util.ArrayList;

public final class Singleton {
    private Singleton(){};

    private static Singleton singleton;
    private static ArrayList<String> strings = new ArrayList<>();

    public static Singleton getSingleton(){
        if (singleton == null){
            singleton = new Singleton();
        }
        return singleton;
    }

    public void addString(String string){
        strings.add(string);
    }
    public void showStrings(){
        System.out.println(strings);
    }
}