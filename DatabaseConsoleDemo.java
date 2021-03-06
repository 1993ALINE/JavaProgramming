
package database.console.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


public class DatabaseConsoleDemo {

    public static void main(String[] args) {
        String DB_URL = "jdbc:mysql://172.17.0.119/fall2015db";
        String DB_USER = "cse2015fall2015";
        String DB_PASS = "fall2015";
        
        try {
            String query = "insert into FoodItem values(101, 'Thai Soup', 90);";
            Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
            System.out.println("Connection Succeeded");
            Statement statement = connection.createStatement();

            
            query = "select * from FoodItem";
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                String itemName = resultSet.getString("itemName");
                double price = resultSet.getDouble("price");
                System.out.printf("%s %f\n", itemName, price);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseConsoleDemo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
