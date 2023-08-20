/*
 * Creating a connection class to make connection,
 *  between the program and MySQL jar file to maintain the records.
 */
package phonebook;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

public class ConnectionFactory {
	static final String driver = "com.mysql.cj.jdbc.Driver"; // Driver name from MySQL library.
    static final String url = "jdbc:mysql://localhost:3306/Phonebook"; // Name of the Database
    static String username = "root"; // UserName
    static String password = "siws"; // Password

    Properties prop;

    Connection conn = null;
    Statement statement = null;
    ResultSet resultSet = null;

    public ConnectionFactory(){
        try {
            Class.forName(driver); // connect with Driver
            conn = DriverManager.getConnection(url, username, password);
            statement = conn.createStatement(); //connection with database
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Connection getConn() {
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, username, password);
            System.out.println("Connected successfully."); //Display the output
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }
}
