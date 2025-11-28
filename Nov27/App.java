package com.demo.Nov27;

import java.util.List;
import java.util.*;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.List;
/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Integer arr[]= {23,43,24,2,5,76,54};
//      

        
        Integer min=Arrays.stream(arr).min((a,b)->a-b).get();
        System.out.println(min);
        
        long count=Arrays.stream(arr).count();
        System.out.println(count);
        
        ///sum of array using reduce;
        int sum=Arrays.stream(arr).reduce(0,(a,b)->a+b);
        System.out.println("Sum of array elements: "+sum);
        
        System.out.println(Arrays.stream(arr).reduce(Integer.MAX_VALUE,(a,b)->a<b?a:b));
        System.out.println(Arrays.stream(arr).reduce(Integer.MIN_VALUE,(a,b)->a>b?a:b));
        //filter
        Stream.of(arr).filter(num->num%2==0).forEach(System.out::println);
        //Map
        Stream.of(arr).map(num->num+10).forEach(System.out::println);
        
       //limit
        Stream.of(arr).limit(5).forEach(System.out::println);
        //distinct
        Stream.of(arr).distinct().forEach(System.out::println);
        
        //Anymatch
        System.out.println(Stream.of(arr).anyMatch(num->num>25));
        
        Integer [] nums= {23,64,75,74,93,23,535,445,6545,4,5,35,4455,455,9};
        List<Integer> numList=Arrays.asList(nums);
        numList.stream().filter(num->num%3==0)//finding 3 multiples
        .distinct()//remove duplicates
        .skip(2)//skip two elemnets
        .forEach(System.out::println);//print results
        
        numList.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println); 
        
        //Stream of Strings
        
        String[] names= {"Amit","Prabhu","Pandey","Harry","Sivakumar"};
        Arrays.stream(names)
        .filter(name->name.length()>5)
        .filter(name->name.startsWith("P"))
        .sorted(Comparator.reverseOrder())
        .forEach(System.out::println);
        
        
        //Streams of user defined object collection
        Employee e1 = new Employee(101, "Ravi Kumar", 55000.0, "Software Engineer", "IT");
        Employee e2 = new Employee(102, "Priya Sharma", 72000.0, "Project Manager", "Operations");
        Employee e3 = new Employee(103, "Arjun Mehta", 48000.0, "QA Analyst", "Quality");
        Employee e4 = new Employee(104, "Neha Kapoor", 65000.0, "HR Specialist", "HR");
        Employee e5 = new Employee(105, "Rohan Bhat", 80000.0, "Data Scientist", "Analytics");

        ArrayList<Employee> elist=new ArrayList<Employee>(Arrays.asList(e1,e2,e3,e4,e5));
        //Streams of of user defined object collection
        elist.stream().filter(emp->emp.getSalary()>50000).forEach(System.out::println);
       // elist.stream().filter(emp->emp.getDesg().equals("Project Manager").forEach(System.out::println));
        
    }
}
