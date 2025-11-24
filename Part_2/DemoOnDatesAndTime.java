package com.test.Nov24.Part2.Part_2;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
public class DemoOnDatesAndTime {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Date currentDate=new Date();
		
		System.out.println(currentDate);
		
//		Date dob=new Date(2003,4,23);
//		System.out.println(dob);
		
		
		
		Date newDate=new Date(2003-1900,4,23);
		System.out.println(newDate);
		
		System.out.println(currentDate.getDate()+3);
		System.out.println(currentDate.getDay());
		System.out.println(currentDate.getYear()+1900);
		
		Date date1=new Date(2025,01,23);
		Date date2=new Date(2026,07,15);
		System.out.println(date1.after(date2));
		
		String str="24-11-2025";
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy  HH:mm:ss");
		System.out.println(sdf.format(currentDate));
		
		SimpleDateFormat sdf1=new SimpleDateFormat("dd-MM-yyyy");
		Date d=sdf1.parse(str);
		System.out.println(d);
		
		

	}

}
