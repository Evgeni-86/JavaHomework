package Examclouds.Seasons;

public class Main {
    public static void main(String[] args) {
        Seasons seasons = Seasons.SUMMER;
        Seasons seasons1 = Seasons.WINTER;
        System.out.println(seasons.getDescription());
        seasons.setTemperature(30);
        System.out.println(seasons.getDescription());
        System.out.println(seasons1.getDescription());
    }

    static void test(Seasons seasons) {
        switch (seasons) {
            case AUTUMN -> System.out.println("the autumn");
            case SPRING -> System.out.println("the spring");
            case SUMMER -> System.out.println("the summer");
            case WINTER -> System.out.println("the winter");
        }
    }
}
