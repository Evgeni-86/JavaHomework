package patternsProject.behavioralPatterns.observer;

public class Main {
    public static void main(String[] args) {
        Magazin magazin = new Magazin();

        Subscriber subscriber1 = new Subscriber(1);
        Subscriber subscriber2 = new Subscriber(2);
        Subscriber subscriber3 = new Subscriber(3);
        Subscriber subscriber4 = new Subscriber(4);

        magazin.addSubscribers(subscriber1);
        magazin.addSubscribers(subscriber2);
        magazin.addSubscribers(subscriber3);
        magazin.addSubscribers(subscriber4);

        magazin.addArticle("Article 1");
        magazin.addArticle("Article 2");
        magazin.addArticle("Article 3");
        magazin.addArticle("Article 4");
    }
}
