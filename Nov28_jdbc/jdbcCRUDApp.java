package com.demo.jdbc.Nov28_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbcCRUDApp {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		 Class.forName("com.mysql.cj.jdbc.Driver");
		 
	        String uname="root";
	        String pwd="root@39";
	        String url="jdbc:mysql://localhost:3306/classicmodels";
	        
	        try(Connection con=DriverManager.getConnection(url,uname,pwd);
	                Statement st= con.createStatement();
	                ResultSet rs=st.executeQuery("Select * from employee");){
	        	
	        	
//	        	String query="Insert into employee values(?,?,?,?,?)";
//	        	PreparedStatement ps=con.prepareStatement(query);
//	        	ps.setInt(1,123);
//	            ps.setString(2, "Gokul");	
//	            ps.setDouble(3, 90000);
//	            ps.setInt(4, 7);
//	            java.sql.Date sqlDate = java.sql.Date.valueOf("2023-11-28"); 
//	            ps.setDate(5, sqlDate);
//	            ps.executeUpdate();
//	            System.out.println("Row inserted successfully");
	          
	            	
	               	ResultSetMetaData rsmd=rs.getMetaData();
	               	int colum=rsmd.getColumnCount();
	               	for(int i=1;i<=colum;i++)
	               		System.out.println(rsmd.getColumnName(i));
	                while(rs.next()) {
//	                	System.out.println("Employee: "+rs.getInt(1));
//	                	System.out.println("Employee Name: "+rs.getString(2));
//	                	System.out.println("Emloyee Salary :"+rs.getString(3));
//	                	System.out.println("Employee deptid :"+rs.getString(4));
	                	
	                	for(int i=1;i<=colum;i++)
	                		System.out.println(rsmd.getColumnName(i)+" : "+ rs.getString(rsmd.getColumnName(i)));
	                	    System.out.println("##############################################");
	                }
	                
	                //Update Record
	                
	                String query="Update employee set deptid=? where id=?";
	                PreparedStatement ps=con.prepareStatement(query);
	                //ps.setInt(1, colum);
	                ps.setInt(1, 10);   // new deptid

	                // set the employee id whose deptid you want to update
	                ps.setInt(2, 123); 
	                ps.executeUpdate();
	                System.out.println("Updated successfully");
	                
	                //delete record
	                String query1 = "DELETE FROM employee WHERE id=?";
	                PreparedStatement ps1 = con.prepareStatement(query1);

	                // set the id of the employee you want to delete
	                ps1.setInt(1, 123);

	                // execute the delete
	                int rowsAffected = ps1.executeUpdate();

	                System.out.println("Rows deleted: " + rowsAffected);

	            
	        }

	}

}
