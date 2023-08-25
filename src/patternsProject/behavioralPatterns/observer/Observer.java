package patternsProject.behavioralPatterns.observer;

import java.util.ArrayList;

public interface Observer {
    void handleEvent(ArrayList<String> articles);
}
