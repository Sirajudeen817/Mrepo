package com.test.Nov24;

/**
 * Hello world!
 *
 */
import java.util.Arrays;

interface MyComparator{
	//public int salComparator(Employee emp1,Employee emp2);
	 public String nameCompare(Employee e1, Employee e2);
}
public class App 
{
    public static void main( String[] args )
    {
    	
    	        Employee[] employees = {
    	            new Employee("Alex", 50000),
    	            new Employee("Sam", 40000),
    	            new Employee("John", 60000),
    	            new Employee("Mary", 45000)
    	        };

    	        
    	       // Arrays.sort(employees, (e1, e2) -> Double.compare(e1.salary, e2.salary));

    	        Arrays.sort(employees,(e1,e2)->e1.name.compareTo(e2.name));
    	        for (Employee e : employees) {
    	            System.out.println(e);
    	        }
    	       
    	    }
    	

    
}
