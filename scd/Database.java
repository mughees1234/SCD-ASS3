/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment3.scd;

import java.sql.ResultSetMetaData;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Mohammad Qayyum
 */
public class Database {
    private  static String url = "jdbc:mysql://localhost:3306/assignment3";
    private  static String username = "root";
    private static String driver = "com.mysql.cj.jdbc.Driver";
    private  static String password = "";
    
    Database(){
    }
    
    public static Connection getConnection() throws SQLException, ClassNotFoundException{
        Connection connection = null;
       

       
    Class.forName(driver);
        connection = DriverManager.getConnection(url, username, password);

        return connection;
    }
    
   
}
