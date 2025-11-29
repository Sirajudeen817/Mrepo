package com.demo.jdbc.Nov28_jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class JdbcProcedureCallDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		 
        String uname="root";
        String pwd="root@39";
        String url="jdbc:mysql://localhost:3306/classicmodels";
        Connection con=DriverManager.getConnection(url,uname,pwd);
        
        CallableStatement cs=con.prepareCall("{call retrieveEmp}");
        ResultSet rs=cs.executeQuery();
        

       	ResultSetMetaData rsmd=rs.getMetaData();
       	int colum=rsmd.getColumnCount();
//       	for(int i=1;i<=colum;i++)
//       		System.out.println(rsmd.getColumnName(i));
        while(rs.next()) {
        	
        	for(int i=1;i<=colum;i++)
        		System.out.println(rsmd.getColumnName(i)+" : "+ rs.getString(rsmd.getColumnName(i)));
        	    System.out.println("##############################################");
        }

	}

}
