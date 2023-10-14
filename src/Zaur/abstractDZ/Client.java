package Zaur.abstractDZ;

public class Client {
    public static void main(String[] args) {
        Mechenosec mechenosec = new Mechenosec("Mechenosec");
        System.out.println(mechenosec.name);
        mechenosec.eat();
        mechenosec.swim();
        mechenosec.sleep();

        Speakable pingvin = new Pingvin("Pingvin");
        pingvin.speak();

        Animal lev = new Lev("Lev");
        System.out.println(lev.name);
        lev.eat();
        lev.sleep();

        Mammal lev2 = new Lev("Lev2");
        System.out.println(lev2.name);
        lev2.eat();
        lev2.run();
        lev2.speak();
        lev2.sleep();
    }
}
