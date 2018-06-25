package Pavanzi;

import java.sql.*;
import javax.swing.JOptionPane;

public class DatabaseConnection {

    private Connection connection;

    public Connection setConnection() {
        try {
            String url = "jdbc:sqlserver://localhost:1433;databaseName=Favanzi";
            String user = "ivanetra";
            String pass = "REXCube01010010";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(url, user, pass);
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return connection;
    }
}