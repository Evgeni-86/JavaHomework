package patternsProject.behavioralPatterns.command;

public class DeleteFromDatabase implements Command{
    Database database;

    public DeleteFromDatabase(Database database) {
        this.database = database;
    }

    @Override
    public void execute() {
        database.delete();
    }
}
