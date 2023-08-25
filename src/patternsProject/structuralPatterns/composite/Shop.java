package patternsProject.structuralPatterns.composite;

import java.util.ArrayList;

public class Shop implements Component {
    ArrayList<Component> shopDepartment = new ArrayList<>();

    @Override
    public void operation() {
        shopDepartment.forEach(elem -> elem.operation());
    }

    public void add(Component component) {
        shopDepartment.add(component);
    }

    public void remove(Component component) {
        shopDepartment.add(component);
    }
}
