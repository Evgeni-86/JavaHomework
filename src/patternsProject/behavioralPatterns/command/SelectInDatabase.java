package patternsProject.behavioralPatterns.command;

public class SelectInDatabase implements Command{
    Database database;

    public SelectInDatabase(Database database) {
        this.database = database;
    }

    @Override
    public void execute() {
        database.select();
    }
}
