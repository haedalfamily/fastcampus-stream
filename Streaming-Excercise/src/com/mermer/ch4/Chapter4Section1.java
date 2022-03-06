package com.mermer.ch4;

import java.util.function.Supplier;

/* functional interface 
 * Supplier
 * */
public class Chapter4Section1 {
	
	public static void main(String[] args) {
		
		Supplier<String> supplier = () -> {
			return "hello world";
		};
		
		System.out.println(supplier.get());
		
		
		Supplier<Double> doubSupplier = () ->{
			return Math.random();
		};
		
//		System.out.println(doubSupplier.get());
		
		printRandomDoubles(doubSupplier, 5);
	}
	

	public static void printRandomDoubles(Supplier<Double> randomSupplier, int count) {
		
		for(int i = 0 ; i < count ; i++) {
			System.out.println(randomSupplier.get());
		}
		
	}
} 
