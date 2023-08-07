package Serialisation;

import java.io.*;

public class Person {
    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    //--------------------------------------------------------------------------
    public void writeObject() {
        String nameFile = "src/Serialisation/" + this.id + ".txt";
        try (PrintWriter printWriter = new PrintWriter(new FileWriter(nameFile))) {
            String formatPrint = "%s,%s\n";
            printWriter.printf(formatPrint, "id","name");
            printWriter.printf(formatPrint, this.id, this.name);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
