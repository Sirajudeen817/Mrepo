package com.test.Nov24;

import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class DemoOnStaticMethodReference {

	static class NumberUtil {

		public static int sqrNum(int num) {
			return num * num;
		}

		public static double log(double num) {
			return Math.log(num);
		}

		public static boolean evenOrOdd(int num) {
			return num % 2 == 0;
		}
	}

	static class StringUtil {
		public static int stringLength(String str) {
			return str.length();
		}
	}

	public static void main(String[] args) {

		Function<Integer, Integer> sqrFunctionUsingLambda = (num) -> NumberUtil.sqrNum(num);
		Function<Double, Double> logFunctionUsingLambda = (num) -> NumberUtil.log(num);
		// Static method reference
		// class name ::method name
		Function<Integer, Integer> sqrFunctionUsingMR = NumberUtil::sqrNum;
		Function<Double, Double> logFunctionUsingMR = NumberUtil::log;

		System.out.println(sqrFunctionUsingLambda.apply(6));
		System.out.println(sqrFunctionUsingMR.apply(7));

		System.out.println(logFunctionUsingLambda.apply(8.0));
		System.out.println(logFunctionUsingMR.apply(7.0));

		Predicate<Integer> evenOrOddUsingLambda = (num) -> NumberUtil.evenOrOdd(num);
		Predicate<Integer> evenOrOddUsingMR = NumberUtil::evenOrOdd;

		System.out.println(evenOrOddUsingMR.test(2));
		System.out.println(evenOrOddUsingLambda.test(5));

		String name = "Alex";
		Function<String, Integer> strLenUsingLambda = (name1) -> StringUtil.stringLength(name1);

		Function<String, Integer> strLenUsingMR = StringUtil::stringLength;

		System.out.println(strLenUsingLambda.apply(name));
		
		
		

	}

}
