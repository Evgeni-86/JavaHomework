package patternsProject.structuralPatterns.decorator;

public class PersonSwim extends PersonDecorator {
    public PersonSwim(PersonFunction personFunction) {
        super(personFunction);
    }

    public String swim() {
        return "person swim";
    }

    @Override
    public String doSome() {
        return super.doSome() + " " + swim();
    }
}
