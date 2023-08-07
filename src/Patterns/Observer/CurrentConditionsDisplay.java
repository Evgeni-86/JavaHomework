package Patterns.Observer;

import java.util.ArrayList;

public class CurrentConditionsDisplay implements Observer {

    @Override
    public void update(ArrayList<Integer> temperatures) {
        System.out.println("Update temperatures for CurrentConditionsDisplay : \n" + temperatures);
    }
}
