package com.test.Nov24;
import java.util.function.Supplier;
public class DemoSupplier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name="Sam";
		Supplier<String> supplier=()->name.toUpperCase();
		System.out.println(supplier.get());
		
		Supplier<Integer> randomSupplier=()->{
			return (int)Math.round(Math.random()*10000);
		};
		System.out.println(randomSupplier.get());
		
		int a=22,b=44;
		
		Supplier<Integer> maxSupplier=()->{
			return (a>b?a:b);
		};
		System.out.println(maxSupplier.get());

	}

}
