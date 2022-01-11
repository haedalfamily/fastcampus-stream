package com.fastcampus.functionalprogramming.chapter9.priceprocessor;

import java.math.BigDecimal;
import java.util.function.Function;

import com.fastcampus.functionalprogramming.chapter9.model.Order;
import com.fastcampus.functionalprogramming.chapter9.model.OrderLine;

public class OrderLineAggregationPriceProcessor implements Function<Order, Order> {

	@Override
	public Order apply(Order order) {
		return order.setAmount(order.getOrderLines().stream()
				.map(OrderLine::getAmount)
				.reduce(BigDecimal.ZERO, BigDecimal::add));
	}

}
