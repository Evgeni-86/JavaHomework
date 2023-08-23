package patternsProject.behavioralPatterns.observer;

import java.util.ArrayList;

public class Magazin implements Observable{

    private final ArrayList<String> articles = new ArrayList<>();
    private final ArrayList<Observer> subscribers = new ArrayList<>();

    public void addArticle(String article){
        this.articles.add(article);
        notifySubscribers();
    }

    public void notifySubscribers(){
        subscribers.forEach( elem -> elem.handleEvent(articles) );
    }

    public void addSubscribers(Observer subscriber){
        this.subscribers.add(subscriber);
    }
    public void removeSubscriber(Observer subscriber){
        this.subscribers.remove(subscriber);
    }
}
