package com.mermer.ch3;

import java.util.function.Function;

public class Adder implements Function<Integer, String>{

	@Override
	public String apply(Integer t) {
		
		
		return String.valueOf(t + 1);
	}

}
