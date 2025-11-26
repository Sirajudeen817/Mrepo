package com.test.Nov25.Nov25;

public class DBConnection {
	//singleton design pattern
	private static DBConnection instance;
	private DBConnection(){
		System.out.println("instance created");
	}
	
	public static DBConnection getInstance() {
		
		if(instance!=null)
			return instance;
		else
			return instance=new DBConnection();
	}

}
