package com.test.Nov24;
import java.util.function.Function;
public class DemoOnFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Function<Integer, Integer> sqrFunction=(num)->num*num;
		
		int arr[]= {1,2,3,4,5,6};
		for(int i=0;i<arr.length;i++)
			System.out.println(sqrFunction.apply(arr[i]));
		
		
		Employee[] e1 = {
	            new Employee("Alex", 50000),
	            new Employee("Sam", 40000),
	            new Employee("John", 60000),
	            new Employee("Mary", 45000)
	        };
		Function<Employee, String> upperCase=(employees)->employees.getName().toUpperCase();
		for(Employee e:e1)
			System.out.println(upperCase.apply(e));
			
        Function<Employee, Employee> checkSalary=(e)->{
        	if(e.getSalary()>50000)
        		return e;
        	else
        		return null;
        };
		
	}

}
