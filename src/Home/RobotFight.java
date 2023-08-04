package Home;

public class RobotFight {
    public static void main(String[] args) {
    Robot Robo1 = new Robot("Robot1", 25, 90);
    Robot Robo2 = new Robot("Robot2", 30, 70);
        boolean rez;
        rez = Robo1.fight(Robo2);
        System.out.println(rez);
        rez = Robo2.fight(Robo1);
        System.out.println(rez);
    }
}
