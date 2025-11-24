package test.com.Maven;

import java.util.Arrays;

public class MyCalculator {

	
	
	public static void main(String[] args)
	{
		//CalculatorInterface mc= (int a, int b)-> a+b;
		//System.out.println(mc.add(5,6));
		
		
//		CalculatorInterface c=(int a,int b)->System.out.println(a-b);
//		c.sub(70, 30);
		
		
//		CalculatorInterface c=()->{
//			int a=89,b=4;
//			System.out.println(a*b);
//		};
//		c.mul();
		
//		CalculatorInterface c=()->{
//			int a=89,b=4;
//			return ((float)a/b);
//		};
//		System.out.println(c.div());
		
		
//		NameInterface m=(name)->System.out.println("Name: "+name);
//		   m.printName("Siraj");
//		   
//		  StringReverse sr=( str)->{
//			  StringBuilder sb=new StringBuilder(str);
//			  System.out.println(sb.reverse().toString());
//		  
//	};
//	sr.stringReverse("Siraj");
//		EvenOrOdd e = (int num) -> {
//			System.out.println(num%2 == 0 ? "even":"odd");
//		};
//		e.Eo(2);
		
//		
//		String[] str= {"apple","Banana","Mosambi"};
//		
//		StringReverse ni=(String[] str1)->{
//			Arrays.sort(str);
//			for(String i:str)
//				System.out.println(i);
//			
//		};
//       ni.sortString(str);
		
		String[] str= {"apple","Banana","Mosambi"};
		StringReverse ni=(String[] str1)->{
			int[] lengths=new int[str1.length];
			for(int i=0;i<str.length;i++) {
				lengths[i]=str1[i].length();
				System.out.println(lengths[i]);
			}
			
		};
		ni.findLength(str);
		
		
		
		
}
}