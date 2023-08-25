package patternsProject.behavioralPatterns.command;

public class InsertInDatabase implements Command{
    private Database database;

    public InsertInDatabase(Database database) {
        this.database = database;
    }

    @Override
    public void execute() {
        database.insert();
    }
}
