package Zaur.abstractDZ;

public class Mechenosec extends Fish{
    public Mechenosec(String name) {
        super(name);
    }

    @Override
    void eat() {
        System.out.println("меченосец обычная рыба, она ест обычный рыбнеый корм");
    }

    @Override
    void swim() {
        System.out.println("меченосец красивая рыба");
    }

}
