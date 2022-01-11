package com.fastcampus.functionalprogramming.chapter10;

import com.fastcampus.functionalprogramming.chapter10.model.Price;
import com.fastcampus.functionalprogramming.chapter10.service.BasicPriceProcessor;
import com.fastcampus.functionalprogramming.chapter10.service.DiscountPriceProcessor;
import com.fastcampus.functionalprogramming.chapter10.service.PriceProcessor;
import com.fastcampus.functionalprogramming.chapter10.service.TaxPriceProcessor;

public class Chapter10Section3 {

	public static void main(String[] args) {
		Price unprocessedPrice = new Price("Original Price");
		
		PriceProcessor basicPriceProcessor = new BasicPriceProcessor();
		PriceProcessor discountPriceProcessor = new DiscountPriceProcessor();
		PriceProcessor taxPriceProcessor = new TaxPriceProcessor();
		
		PriceProcessor decoratedPriceProcessor = basicPriceProcessor
			.andThen(discountPriceProcessor)
			.andThen(taxPriceProcessor);
		Price processedPrice = decoratedPriceProcessor.process(unprocessedPrice);
		System.out.println(processedPrice.getPrice());
		
		PriceProcessor decoratedPriceProcessor2 = basicPriceProcessor
				.andThen(taxPriceProcessor)
				.andThen(price -> new Price(price.getPrice() + ", then apply another procedure"));
		Price processedPrice2 = decoratedPriceProcessor2.process(unprocessedPrice);
		System.out.println(processedPrice2.getPrice());
	}

}
