package conectionToDataBaseTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;


public class Main {

    public static void main(String[] args) throws Exception {

        String url = "jdbc:postgresql://localhost:5432/postgres";
        String user = "postgres";
        String password = "1";
        Connection connection = DriverManager.getConnection(url, user, password);

        Statement statement = connection.createStatement();
        PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO users (name, age) VALUES (?, ?)");

        statement.execute("CREATE TABLE IF NOT EXISTS users (id SERIAL PRIMARY KEY, name VARCHAR(255), age INTEGER)");

        preparedStatement.setString(1, "John");
        preparedStatement.setInt(2, 30);
        preparedStatement.executeUpdate();

        connection.close();
    }

}


