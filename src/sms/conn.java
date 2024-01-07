package sms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class conn {
    Connection c;
    Statement s;
    conn(){
        String username = "root";
        String password = "12345678";
        String url = "jdbc:mysql://localhost:3306/studmonsys";
        try{
          c = DriverManager.getConnection(url, username,password);
          s = c.createStatement();
            System.out.println("paplu bhai");

        }catch (Exception e){
            System.out.println("Connection failed");
        }
    }

}
