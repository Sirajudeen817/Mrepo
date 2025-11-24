package com.test.Nov24;

import java.util.function.Predicate;

public class DemoOnPredicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Predicate<Integer> isEven=(n)->n%2==0;
		System.out.println(isEven.test(36));
		
		if(isEven.test(35))
			System.out.println("Even");
		else
			System.out.println("Odd");
		
		System.out.println(isEven.test(78)?"Even":"Odd");
		
		
		Predicate<String> checkLength=(str)->str.length()>7;
		System.out.println(checkLength.test("Sirajudeen"));
		
		Predicate<Employee> checkSalary=(employees)->employees.salary>=50000;
			
		
		Employee[] employees = {
	            new Employee("Alex", 50000),
	            new Employee("Sam", 40000),
	            new Employee("John", 60000),
	            new Employee("Mary", 45000)
	        };
		
		for(Employee e:employees)
			if(checkSalary.test(e))
				System.out.println(e);
		
		

	}

}
