package patternsProject.behavioralPatterns.memento;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        File saves = new File();

        game.set("LVL 1", 50000);
        System.out.println(game);

        saves.addSave(game.save());
        System.out.println("savesList : " + saves.getSaves());

        game.set("LVL 2", 100000);
        System.out.println(game);

        saves.addSave(game.save());
        System.out.println("savesList " + saves.getSaves());

        game.load(saves.getSaves().get(0));
        System.out.println(game);
    }
}
