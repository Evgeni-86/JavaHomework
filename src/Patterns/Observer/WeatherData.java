package Patterns.Observer;

import java.util.ArrayList;

public class WeatherData implements Subject {
    private final ArrayList<Observer> observers = new ArrayList<>();
    private final ArrayList<Integer> temperatures = new ArrayList<>();

    public void setTemperatures(int temperature) {
        this.temperatures.add(temperature);
        notifyObserver();
    }

    //-----------------------------------------------------------------
    @Override
    public void registerObserver(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : this.observers) {
            observer.update(temperatures);
        }
    }
}
