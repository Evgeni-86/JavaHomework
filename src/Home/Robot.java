package Home;

public class Robot {
    private String name;
    private int age;
    private int power;

    public Robot(String name, int age, int power) {
        this.name = name;
        this.age = age;
        this.power = power;
    }

    public String getName() {
        return name;
    }
    public int getPower() {
        return power;
    }

    public boolean fight(Robot obj) {
            return (obj.getPower() < this.power);
    }
}
//Обьяснить на этом примере модификаторы доступа!!!