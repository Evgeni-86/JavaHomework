package javaRash.ipodrom;

import java.util.*;

public class Hippodrome {

    static Hippodrome game;
    private List<Horse> horses;

    public Hippodrome(List<Horse> horses) {
        this.horses = horses;
    }

    public List getHorses() {
        return horses;
    }

    public Horse getWinner() {
        return horses.stream().max((el1, el2) -> Double.compare(el1.distance, el2.distance)).get();
    }
    public void printWinner() {
        System.out.println("Winner is " + getWinner().name);
    }

    public void run(){
        for(int i = 1; i <= 100; i++) {
            move();
            print();
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException();
            }
        }
    }
    public void move(){
        horses.forEach(Horse::move);
    }
    public void print(){
        horses.forEach(Horse::print);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
    }


    public static void main(String[] args) {
        Horse horse1 = new Horse("horse1", 3, 0);
        Horse horse2 = new Horse("horse2", 3, 0);
        Horse horse3 = new Horse("horse3", 3, 0);

        List<Horse> horses = new ArrayList<>();
        horses.add(horse1);
        horses.add(horse2);
        horses.add(horse3);

        Hippodrome hippodrome = new Hippodrome(horses);
        Hippodrome.game = hippodrome;
        game.run();
        game.printWinner();
    }
}