package com.fastcampus.functionalprogramming.chapter9.priceprocessor;

import java.math.BigDecimal;
import java.util.function.Function;

import com.fastcampus.functionalprogramming.chapter9.model.Order;

public class TaxPriceProcessor implements Function<Order, Order>{

	private final BigDecimal taxRate;
	
	public TaxPriceProcessor(BigDecimal taxRate) {
		this.taxRate = taxRate;
	}
	
	@Override
	public Order apply(Order order) {
		return order.setAmount(order.getAmount()
				.multiply(taxRate.divide(new BigDecimal(100)).add(BigDecimal.ONE)));
	}

}
