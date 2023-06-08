package inventomate;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB {
    
    public static Connection mycon() {
        Connection conn = null;
        
        try {
            // Database Credentials: URL, username, and password
            String url = "jdbc:mysql://localhost:3306/inventomatedb";
            String username = "InventoDB_Manager";
            String password = "Java#1Project";
            
            // Loading the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // Establish the database connection
            conn = DriverManager.getConnection(url, username, password);
//            System.out.println("Connected to the MySQL database.");
            return conn;
            
        } catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC driver not found.");
            e.printStackTrace();
            
        } catch (SQLException e) {
            System.out.println("Error connecting to the MySQL database.");
            e.printStackTrace();
        }
        
        return conn;
    }
}
