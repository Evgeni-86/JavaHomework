package patternsProject.structuralPatterns.decorator;

public class PersonDrive extends PersonDecorator{
    public PersonDrive(PersonFunction personFunction) {
        super(personFunction);
    }

    public String driving(){
        return "person drive";
    }

    @Override
    public String doSome() {
        return super.doSome() + " " + driving();
    }
}
