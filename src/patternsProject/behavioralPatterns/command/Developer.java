package patternsProject.behavioralPatterns.command;

public class Developer {
    private Command insert;
    private Command update;
    private Command select;
    private Command delete;

    public Developer(Command insert, Command update, Command select, Command delete) {
        this.insert = insert;
        this.update = update;
        this.select = select;
        this.delete = delete;
    }

    public void insertCommand(){
        this.insert.execute();
    }
    public void updateCommand(){
        this.update.execute();
    }
    public void selectCommand(){
        this.select.execute();
    }
    public void deleteCommand(){
        this.delete.execute();
    }

}
