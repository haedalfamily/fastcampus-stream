package com.mermer.ch4;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/* functional interface 
 * Consumer
 * */
public class Chapter4Section2 {
	
	public static void main(String[] args) {
		
		Consumer<String> myStringConsummer = (String str) -> {
			System.out.println(str);
		};
		
	//	myStringConsummer.accept("hello");
		
		List<Integer> integerInputs = Arrays.asList(4, 2, 3);// immutable 이기 때문에
		//integerInputs.add(4);//불가능
		
		Consumer<Integer> myIntegerProcessor = (Integer x) -> {
			System.out.println("Processiing Integer " + x);
		};
		
		process(integerInputs, myIntegerProcessor);
		
		Consumer<Integer> myDifferentIntegerProcessor = x 
				-> System.out.println("Processing Integer in different way " + x);
				
		process(integerInputs, myDifferentIntegerProcessor);
		
		Consumer<Double> myDoubleProcessor = x 
				-> System.out.println("Processing Double in different way " + x);
				
		List<Double> doubleInputs = Arrays.asList(1.4, 2.2, 3.3);		
		process(doubleInputs, myDoubleProcessor);
		
	}

	
	public static <T> void process(List<T> inputs, Consumer<T> processor) {
		for(T input : inputs) {
			processor.accept(input);
		}
	}
}
