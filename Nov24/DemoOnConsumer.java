package com.test.Nov24;
import java.util.Arrays;
import java.util.function.Consumer;
public class DemoOnConsumer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Consumer<Integer> sqrConsumer=(num1)->{
			System.out.println(num1*num1); 
			
		};
		
		sqrConsumer.accept(4);
		
		
		
		Consumer<Integer[]> sortConsumer=(arr)->{
			Arrays.sort(arr);
			System.out.println(Arrays.toString(arr));
		};
		Integer arr[] = {47,34,64,74,85};
		sortConsumer.accept(arr);
		
		
		
		

		Consumer<Employee[]> printConsumer=(employees)->{
			for(Employee e:employees)
				System.out.println(e.name);
				
				
		};
		Employee[] employees = {
	            new Employee("Alex", 50000),
	            new Employee("Sam", 40000),
	            new Employee("John", 60000),
	            new Employee("Mary", 45000)
	        };
		printConsumer.accept(employees);
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
