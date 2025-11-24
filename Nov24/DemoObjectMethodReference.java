package com.test.Nov24;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class DemoObjectMethodReference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String myname="Douglas";
		Supplier<Integer> lengthUsingLambda=()->myname.length();
		Supplier<Integer> lengthUsingMR=myname::length;
		System.out.println(lengthUsingLambda.get());
		System.out.println(lengthUsingMR.get());
		
		
		Hello h=new Hello();
		Supplier<String> helloUsingLambda =()->h.sayHello();
		Supplier<String> helloUsingMR =h::sayHello;
		System.out.println(helloUsingLambda.get());
		System.out.println(helloUsingMR.get());
		
		
		NumberUtil1 nu=new NumberUtil1();
		Predicate<Integer> evenOrOddUsingMR=nu::isEven;
		System.out.println(evenOrOddUsingMR.test(6));
		
		
		Function<Integer, Integer> sqrNumUsingMR=nu::sqrNum;
		System.out.println(sqrNumUsingMR.apply(6));
		
		Function<Integer, Double> logNumUsingMR=nu::logNum;
		System.out.println(logNumUsingMR.apply(6));
		
		int arr[]= {1,2,3,4,5};
		Consumer<int []> printMR=nu::printNum;
		printMR.accept(arr);
		
		
		String arr1[]= {"Apple","Banana","Avacado"};
		Consumer<String []> print1MR=nu::filter;
		print1MR.accept(arr1);
		
		Employee[] employees = {
	            new Employee("Alex", 50000),
	            new Employee("Sam", 40000),
	            new Employee("John", 60000),
	            new Employee("Mary", 45000)
	        };
		Consumer<Employee []> salWithBonusMR=nu::salaryWithBonus;
		salWithBonusMR.accept(employees);
		
	}

}
class Hello{
	public String sayHello() {
		return "Hello";
	}
	
	
}
class NumberUtil1{
	public boolean isEven(int num) {
		return num%2==0;
	}
	public int sqrNum(int num)
	{
		return num*num;
	}
	public double logNum(int num) {
		return Math.log(num);
	}
	public void printNum(int[] arr) {
		for(int i=0;i<arr.length;i++)
			System.out.println(i);
	}
	public void filter(String[] arr) {
		for(String i:arr) {
			if(i.contains("A"))
				System.out.println(i);
		}
	}
	public void salaryWithBonus(Employee[] arr) {
		for(Employee e:arr) {
			System.out.println(e.getSalary()*0.10);
		}
	}
	
}
//Filter String that starts with'A'
//print employee salary with bonus
//validate password-should have minimum length of 8, atleast one capital letter,one small letter,one digit and one 
//special character