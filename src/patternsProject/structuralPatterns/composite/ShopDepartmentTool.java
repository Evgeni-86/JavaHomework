package patternsProject.structuralPatterns.composite;

import java.util.ArrayList;

public class ShopDepartmentTool implements Component{
    ArrayList<Component> tools = new ArrayList<>();

    @Override
    public void operation() {
        tools.forEach(elem -> elem.operation());
    }

    public void add(Component component) {
        tools.add(component);
    }

    public void remove(Component component) {
        tools.remove(component);
    }
}
