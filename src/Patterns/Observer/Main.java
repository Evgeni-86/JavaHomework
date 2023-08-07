package Patterns.Observer;

public class Main {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        Observer observer1 = new CurrentConditionsDisplay();

        weatherData.registerObserver(observer1);

        weatherData.setTemperatures(35);
    }
}
