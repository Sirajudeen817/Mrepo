package com.test.Nov24.Part2.Part_2;

import java.time.LocalDate;
import java.time.Period;



public class DemoOnLocalDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDate today= LocalDate.now();
		System.out.println(today);
		System.out.println(today.getYear());
		System.out.println(today.getMonthValue());
		System.out.println(today.getDayOfWeek());
		
		
		LocalDate mydate=LocalDate.of(2025, 6, 23);
		System.out.println(mydate);
		
		System.out.println("3 days ahead date is "+today.plusDays(3));
		System.out.println("5 days before today is "+today.minusDays(5));
		
		LocalDate date1=LocalDate.of(2023, 5, 15);
		LocalDate date2=LocalDate.of(2020, 7, 24);
		System.out.println(date1.isBefore(date2));
		System.out.println(date1.isAfter (date2));
		
		
		today=LocalDate.now();
		LocalDate dob=LocalDate.of(2003, 05, 23);
		Period p=Period.between(dob, today);
		System.out.println("My age is "+p.getYears()+" years "+p.getMonths()+" months "+p.getDays()+" days ");
		
	}

}
