package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DataBase {
    public static void main(String[] args) {
        // JDBC driver name and database URL
        String jdbcDriver = "org.h2.Driver";
        String databaseUrl = "jdbc:h2:~/test";  // Replace "your-database-name" with your desired database name

        // Database credentials
        String username = "sa";
        String password = "";

        try {
            // Register JDBC driver
            Class.forName(jdbcDriver);

            // Open a connection
            Connection connection = DriverManager.getConnection(databaseUrl, username, password);

            // Create a statement
            Statement statement = connection.createStatement();

            // Execute a statement to create a table
            String createTableQuery = "SELECT * from EMPLOYEES";  // Replace "your_table_name" with the desired table name
            statement.executeUpdate(createTableQuery);

            // Close the resources
            statement.close();
            connection.close();

            System.out.println("Database created successfully.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
