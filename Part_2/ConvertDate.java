package com.test.Nov24.Part2.Part_2;

import java.text.ParseException;
import java.text.SimpleDateFormat;

//import java.sql.Date;

import java.util.Date;

import javax.swing.text.SimpleAttributeSet;

public class ConvertDate {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
		Date date =new Date(2025-1900,11,24);
		System.out.println(date);
		System.out.println(new java.util.Date());
	    java.util.Date utilDate=new java.util.Date();

        Date today=new Date();
		java.sql.Date sqlDate=new java.sql.Date(today.getTime());
		System.out.println(today);
		System.out.println(sqlDate);
		
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		String formatedDate=sdf.format(today);
	    sqlDate=java.sql.Date.valueOf(formatedDate);
		System.out.println(sqlDate);
		
		//Converts string to util and then to sql date 
		String strDate="15=08-2025";
		sdf =new SimpleDateFormat("dd-MM-yyyy");
		java.util.Date uDate=sdf.parse(strDate);
		java.sql.Date sDate=new java.sql.Date(uDate.getTime());
		
		java.sql.Date sqlDate1 =java.sql.Date.valueOf("2025-10-24");
        java.util.Date uudate = new java.sql.Date(sqlDate.getTime());
        java.util.Date uudate1 = sqlDate1;
        
        
        java.sql.Date sqlDate2=java.sql.Date.valueOf("2025-03-25");
        String str=sqlDate2.toString();
        SimpleDateFormat sdf1=new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(sdf1.parseObject(str));
        
        
		
		
		
		
	}

}
