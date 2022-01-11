package com.fastcampus.functionalprogramming.chapter10.service;

import com.fastcampus.functionalprogramming.chapter10.model.Price;

@FunctionalInterface
public interface PriceProcessor {
	Price process(Price price);
	
	default PriceProcessor andThen(PriceProcessor next) {
		return price -> next.process(process(price));
	}
}
