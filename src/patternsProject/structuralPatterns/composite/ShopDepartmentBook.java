package patternsProject.structuralPatterns.composite;

import java.util.ArrayList;

public class ShopDepartmentBook implements Component{
    ArrayList<Component> books = new ArrayList<>();

    @Override
    public void operation() {
        books.forEach(elem -> elem.operation());
    }

    public void add(Component component) {
        books.add(component);
    }

    public void remove(Component component) {
        books.remove(component);
    }
}
