package patternsProject.behavioralPatterns.observer;

import java.util.ArrayList;

public class Subscriber implements Observer{
    private long id;

    public Subscriber(long id) {
        this.id = id;
    }

    @Override
    public void handleEvent(ArrayList<String> articles) {
        System.out.println("Subscriber " + this.id + " received update articles" + articles);
    }
}
