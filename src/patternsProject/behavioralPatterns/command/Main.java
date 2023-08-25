package patternsProject.behavioralPatterns.command;

public class Main {
    public static void main(String[] args) {
        Database database = new Database();

        InsertInDatabase insertInDatabase = new InsertInDatabase(database);
        UpdateDatabase updateDatabase = new UpdateDatabase(database);
        SelectInDatabase selectInDatabase = new SelectInDatabase(database);
        DeleteFromDatabase deleteFromDatabase = new DeleteFromDatabase(database);

        Developer developer = new Developer(insertInDatabase, updateDatabase, selectInDatabase,deleteFromDatabase);

        developer.insertCommand();
        developer.selectCommand();
        developer.updateCommand();
        developer.deleteCommand();
    }
}
