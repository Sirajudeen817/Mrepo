package com.test.Nov25.Nov25;

import java.time.DateTimeException;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DemoOnZonedDateAndTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ZonedDateTime dateTime=ZonedDateTime.now();
		System.out.println(dateTime);
		System.out.println(dateTime.getOffset());
		System.out.println(dateTime.getZone());
		System.out.println(dateTime.getDayOfMonth());
		//System.out.println(dateTime.get());
		
		ZonedDateTime regionDateTime=ZonedDateTime.now(ZoneId.of("America/New_York"));
		System.out.println(regionDateTime);
		
//		
//		Duration diff=Duration.between(dateTime.toInstant(), regionDateTime.toInstant());
//		System.out.println(diff.toHours());
		 //ZonedDateTime dateTime = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
	       // ZonedDateTime regionDateTime = ZonedDateTime.now(ZoneId.of("America/New_York"));

	        // Get offsets
	        int offset1 = dateTime.getOffset().getTotalSeconds() / 3600;
	        int offset2 = regionDateTime.getOffset().getTotalSeconds() / 3600;

	        int diffHours = offset1 - offset2;
	        System.out.println("Offset difference in hours: " + diffHours);
	        
	        LocalDateTime ldt=LocalDateTime.now();
	        ZonedDateTime  zdt=ldt.atZone(ZoneId.of("Asia/Kolkata"));
	        System.out.println(zdt);
	        
	        ZonedDateTime it=ZonedDateTime.now();
	        ZonedDateTime ut=it.withZoneSameInstant(ZoneId.of("America/New_York"));
	        System.out.println(it);
	        System.out.println(ut);
	        
	        
	        DateTimeFormatter df=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm a z");
	        String fzdt=it.format(df);
	        System.out.println(fzdt);

	}

}
