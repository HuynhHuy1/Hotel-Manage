package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionDB {
    Connection connection;
    Statement statement;

    public ConnectionDB() {
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotelms", "root", "");
            statement = connection.createStatement();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
