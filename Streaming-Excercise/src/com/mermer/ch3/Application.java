package com.mermer.ch3;

import java.util.function.Function;

public class Application {

	public static void main(String[] args) {
		
		Function<Integer, String> adder =  x -> String.valueOf(x + 3);
		
		String result = adder.apply(5);
		
		System.out.println(result);
	}

}
