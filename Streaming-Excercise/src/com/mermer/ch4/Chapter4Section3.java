package com.mermer.ch4;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;

/* functional interface 
 * BiConsumer
 * */
public class Chapter4Section3 {

	public static void main(String[] args) {
		BiConsumer<Integer, Double> biConsumer = (index, input) -> {
			System.out.println("Porcessing " + input + " at index " + index);
		};
		
		
		List<Double> input = Arrays.asList(1.1, 1.2, 1.3);
		
		process(input, biConsumer);
	}
	
	public static <T> void process(List<T> inputs, BiConsumer<Integer, T> processor){
		for(int i = 0 ; i < inputs.size(); i++) {
			processor.accept(i, inputs.get(i));
		}
	}
}
