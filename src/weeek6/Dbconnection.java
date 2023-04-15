/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package weeek6;

/**
 *
 * @author niyilola
 */
import java.sql.*;
public class Dbconnection {
    Connection conn = null;
    public static Connection connectDb()
    {
    try {
        Class.forName("org.sqlite.JDBC");// load the sqlite driver
        //connect to database
        Connection conn = DriverManager.getConnection("jdbc:sqlite:login.db");
        System.out.println("connection is sucessful");
        return conn;
    
    }
    catch(Exception e){
        System.out.println("connection failed");
        return null ; 
    
                }
                
    
    }
    
}
