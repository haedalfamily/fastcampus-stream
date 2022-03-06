package com.mermer.ch4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/* functional interface 
 * Predicate - Âü °ÅÁþ
 * */
public class Chapter4Section4 {

	
	public static void main(String[] args) {
	
		
		Predicate<Integer> isPositive = x -> x > 0;
		
		//System.out.println(isPositive.test(10));
		List<Integer> inputs = Arrays.asList(10, -5, 4, -2, 0, 7);
		
		
		System.out.println("Positive number: " + filter(inputs, isPositive));
		
		System.out.println("Non-Positive number: " + filter(inputs, isPositive.negate()));
		
		
		//Predicate<Integer> isZero = x -> x == 0; 
		
		System.out.println("Positive or Zero number: " + filter(inputs, isPositive.or(x -> x == 0)));
		
		
		System.out.println("Positive even number: " + filter(inputs, isPositive.and(x -> x % 2 == 0)));
		
	}
	
	
	public static <T> List<T> filter(List<T> inputs, Predicate<T> condition){
		List<T> output = new ArrayList<T>();
		
		for(T input : inputs) {
			if(condition.test(input)) {
				output.add(input);
			}
		}
		return output;
	}
	
	
	
}
