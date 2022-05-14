package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;



//data base connection

public class Payment {
	
	private Connection connect() {
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			// Provide the correct details: DBServer/DBName, username, password
			con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/lab", "root", "");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}
	
	//insert

		public String insertPayment(String CustomerName, String BillAmount, String AccountNo)  
		{   
			String output = ""; 
		 
			try   
			{    
				Connection con = connect(); 
		 
				if (con == null)    
				{return "Error while connecting to the database for inserting."; } 
		 
				// create a prepared statement 
				String query = " insert into pay (PaymentID , CustomerName , BillAmount , AccountNo)"+ " values (?, ?, ?, ?)"; 
		 
		 
				PreparedStatement preparedStmt = con.prepareStatement(query); 
		 
				// binding values    
				 preparedStmt.setInt(1, 0);
				 preparedStmt.setString(2, CustomerName);
				 preparedStmt.setString(3, BillAmount);
				 preparedStmt.setString(4, AccountNo);
				 
				
				// execute the statement    
				preparedStmt.execute();    
				con.close(); 
		   
				String newPayment = readPayment(); 
				output =  "{\"status\":\"success\", \"data\": \"" + newPayment + "\"}";    
			}   
			catch (Exception e)   
			{    
				output =  "{\"status\":\"error\", \"data\": \"Error while inserting the Payment.\"}";  
				System.err.println(e.getMessage());   
			} 
			
		  return output;  

}
