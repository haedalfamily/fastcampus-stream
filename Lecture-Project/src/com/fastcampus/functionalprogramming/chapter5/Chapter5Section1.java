package com.fastcampus.functionalprogramming.chapter5;

import java.util.function.Function;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class Chapter5Section1 {
	public static int calculate(int x, int y, BiFunction<Integer, Integer, Integer> operator) {
		return operator.apply(x, y);
	}
	
	public static int multiply(int x, int y) {
		return x * y;
	}
	
	public int subtract(int x, int y) {
		return x - y;
	}
	
	public void myMethod() {
		System.out.println(calculate(10, 3, this::subtract));
	}
	
	
	public static void main(String[] args) {
		int a = Integer.parseInt("15");
		Function<String, Integer> str2int = Integer::parseInt;
		System.out.println(str2int.apply("20"));
		
		String str = "hello";
		boolean b = str.equals("world");
		Predicate<String> equalsToHello = str::equals;
		System.out.println(equalsToHello.test("world"));
		
		System.out.println(calculate(8, 2, (x, y) -> x + y));
		System.out.println(calculate(8, 2, Chapter5Section1::multiply));
		
		Chapter5Section1 instance = new Chapter5Section1();
		System.out.println(calculate(8, 2, instance::subtract));
		instance.myMethod();
	}

}
