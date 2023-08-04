package Lessons.lesson07.FurnitureFactory;


import Patterns.SimUDuck.Behavior;

public class Main {
    public static void main(String[] args) {
        boolean canRepaired = false;
        KitchenTable kitchenTable = new KitchenTable();
        Stool stool = new Stool();

        canRepaired = Workshop.BestCarpenterEver(stool);
        System.out.println(canRepaired);
        canRepaired = Workshop.BestCarpenterEver(kitchenTable);
        System.out.println(canRepaired);
    }
}
