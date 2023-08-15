package com.lumen.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DBConnect {
   private static   Connection connection;
   public static Connection getConnection() {
       String url="jdbc:mysql://localhost:3306/Todo";
       String username="root";
       String password="admin@123";
       

       try
       {
    	   Class.forName("com.mysql.cj.jdbc.Driver");
    	     connection = DriverManager.getConnection(url,username,password);
           // Statement statement = connection.createStatement();
       }catch(Exception e) {
           e.printStackTrace();
       }
       return connection;
   }
//	public static void closeConnection() {
//		// TODO Auto-generated method stub
//		
//	} 
}