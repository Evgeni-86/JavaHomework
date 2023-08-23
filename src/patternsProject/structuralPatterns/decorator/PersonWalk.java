package patternsProject.structuralPatterns.decorator;

public class PersonWalk implements PersonFunction{
    @Override
    public String doSome() {
        return "person walk";
    }
}
