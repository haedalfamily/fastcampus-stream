package com.mermer.ch3;

import java.util.function.BiFunction;

public class Application_session3 {

	public static void main(String[] args) {
		
		BiFunction<Integer, Integer, String> biFn = (x, y) -> String.valueOf(x+y);
		
		
		System.out.println(biFn.apply(3, 5));
	}
}
