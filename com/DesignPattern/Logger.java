package com.DesignPattern;

import com.test.Nov25.Nov25.DBConnection;

public class Logger {
	 private static Logger instance;
	 
	 private Logger(){
			System.out.println("User created");
		}

	 
	 public static Logger getInstance() {
		 if(instance!=null)
			 return instance;
		 else
			 return instance=new Logger();
		 
	 }
}
