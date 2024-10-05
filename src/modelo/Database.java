
package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Database {

    private final String USER = "root";
    private final String PASSWORD = "21598MySql";
    private final String URL = "jdbc:mysql://localhost/carrentalsystem";
    private Statement statement;

    public Database(){

        try {

            Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
            statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Statement getStatement(){
        return statement;
    }

}
