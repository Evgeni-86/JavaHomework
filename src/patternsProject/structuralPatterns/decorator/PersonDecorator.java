package patternsProject.structuralPatterns.decorator;

public class PersonDecorator implements PersonFunction{
    PersonFunction personFunction;

    public PersonDecorator(PersonFunction personFunction) {
        this.personFunction = personFunction;
    }

    @Override
    public String doSome() {
        return personFunction.doSome();
    }
}
