package com.fastcampus.functionalprogramming.chapter5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Supplier;

public class Chapter5Section4 {
	public static void main(String[] args) {
		printRandomDoubles(Math::random, 5);
		
		List<String> names = new ArrayList<>();
		names.add("Bob");
		names.add("Charlie");
		names.add("Alice");
		System.out.println(names);
		
		Collections.sort(names, String::compareTo);
		System.out.println(names);
	}
	
	public static void printRandomDoubles(Supplier<Double> randomSupplier, int count) {
		for (int i = 0; i < count; i++) {
			System.out.println(randomSupplier.get());
		}
	}
}
