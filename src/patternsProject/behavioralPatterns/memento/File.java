package patternsProject.behavioralPatterns.memento;

import java.util.ArrayList;

public class File {
    private ArrayList<Save> saves = new ArrayList<>();

    public void addSave(Save save) {
        saves.add(save);
    }

    public ArrayList<Save> getSaves() {
        return saves;
    }
}
