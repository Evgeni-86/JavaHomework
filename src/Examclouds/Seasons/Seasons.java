package Examclouds.Seasons;

public enum Seasons {
    WINTER(-15, "Холодное время года"),
    SPRING(10, "Прохладное время года"),
    SUMMER(20, "Теплое время года"),
    AUTUMN(10, "Прохладное время года");
    private int temperature;
    private String description;

    Seasons(int temperature, String description){
        this.temperature = temperature;
        this.description = description;
    }

    public String getDescription(){
        return "Средняя температура: " + temperature +", "+  description;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
