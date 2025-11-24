package com.test.Nov24.Part2.Part_2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DemoOnLocalDateTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		{
	        
	        // Current date and time
	        LocalDateTime dateTime = LocalDateTime.now();
	        System.out.println("Current LocalDateTime: " + dateTime);
	        
	        // Specific date and time
	        LocalDateTime dt1 = LocalDateTime.of(2025, 11, 24, 9, 30);
	        System.out.println("Specific LocalDateTime: " + dt1);
	        
	        LocalDateTime dt2 = LocalDateTime.of(2025, 11, 24, 10, 45, 39);
	        System.out.println("Specific LocalDateTime with seconds: " + dt2);
	        
	        // Get individual components
	        System.out.println("Year: " + dateTime.getYear());
	        System.out.println("Month: " + dateTime.getMonth());
	        System.out.println("Day: " + dateTime.getDayOfMonth());
	        System.out.println("Hour: " + dateTime.getHour());
	        System.out.println("Minute: " + dateTime.getMinute());
	        System.out.println("Second: " + dateTime.getSecond());
	        
	        // Converting string to LocalDateTime (ISO format)
	        String strDateTime = "2025-11-24T11:35:20";
	        LocalDateTime convertedDateTime = LocalDateTime.parse(strDateTime);
	        System.out.println("Converted LocalDateTime: " + convertedDateTime);
	        
	        // Formatting LocalDateTime
	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
	        String formattedDateTime = dateTime.format(formatter);
	        System.out.println("Formatted LocalDateTime: " + formattedDateTime);
	        
	        // MIN and MAX values
	        System.out.println("LocalDateTime.MIN: " + LocalDateTime.MIN);
	        System.out.println("LocalDateTime.MAX: " + LocalDateTime.MAX);
	        
//	        String strDateTime1 = "26-05-2025 11:35:20";
//	        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm:ss a");
//	        LocalDateTime dt = LocalDateTime.parse(strDateTime1, formatter1);
//	        System.out.println(dt.format(formatter1)); 
//	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm:ss a");
//	        System.out.println(dt.format(formatter));
	        String strDateTime2 = "26-05-2025 17:45:30";
	        
	        // Formatter for parsing (24-hour clock)
	        DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
	        
	        // Parse string into LocalDateTime
	        LocalDateTime dt = LocalDateTime.parse(strDateTime2, inputFormatter);
	        
	        // Formatter for output (12-hour clock with AM/PM)
	        DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm:ss a");
	        
	        // Print formatted LocalDateTime
	        System.out.println("Original: " + strDateTime2);
	        System.out.println("Converted LocalDateTime: " + dt);
	        System.out.println("Formatted with AM/PM: " + dt.format(outputFormatter));
	        


	}

}
}