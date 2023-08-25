package patternsProject.behavioralPatterns.command;

public class UpdateDatabase implements Command {
    private Database database;

    public UpdateDatabase(Database database) {
        this.database = database;
    }

    @Override
    public void execute() {
        database.update();
    }
}
