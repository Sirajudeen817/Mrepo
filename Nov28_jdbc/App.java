package com.demo.jdbc.Nov28_jdbc;

import java.awt.Taskbar.State;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Driver Registered successfully");
        
        String uname="root";
        String pwd="root@39";
        String url="jdbc:mysql://localhost:3306/classicmodels";
        
        System.out.println("Done");
        
        try(Connection con=DriverManager.getConnection(url,uname,pwd);
        //String Query="Select * from employee";
        Statement st= con.createStatement();
        ResultSet rs=st.executeQuery("Select * from employee");){
        	
       	ResultSetMetaData rsmd=rs.getMetaData();
       	int colum=rsmd.getColumnCount();
       	for(int i=1;i<=colum;i++)
       		System.out.println(rsmd.getColumnName(i));
        while(rs.next()) {
//        	System.out.println("Employee: "+rs.getInt(1));
//        	System.out.println("Employee Name: "+rs.getString(2));
//        	System.out.println("Emloyee Salary :"+rs.getString(3));
//        	System.out.println("Employee deptid :"+rs.getString(4));
        	
        	for(int i=1;i<=colum;i++)
        		System.out.println(rsmd.getColumnName(i)+" : "+ rs.getString(rsmd.getColumnName(i)));
        	    System.out.println("##############################################");
        }
        
        DatabaseMetaData dbmd=con.getMetaData();
        System.out.println(dbmd.getDatabaseProductName());
        System.out.println(dbmd.getDriverName());
        ResultSet rs1=dbmd.getTables(null, null, "%"
        		+ "", new String[] {"TABLE"});
        while(rs1.next()) {
        	System.out.println(rs1.getString("TABLE_NAME"));
        }
        rs1.close();
        
        }
       catch(Exception e) {
    	   e.printStackTrace();
       }
        
    }
}
