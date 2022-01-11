package com.fastcampus.functionalprogramming.chapter10.service;

import java.util.Optional;
import java.util.function.Consumer;

import com.fastcampus.functionalprogramming.chapter10.model.Order;

public class OrderProcessStep {
	private final Consumer<Order> processOrder;
	private OrderProcessStep next;
	
	public OrderProcessStep(Consumer<Order> processOrder) {
		this.processOrder = processOrder;
	}
	
	public OrderProcessStep setNext(OrderProcessStep next) {
		if (this.next == null) {
			this.next = next;
		} else {
			this.next.setNext(next);
		}
		return this;
	}
	
	public void process(Order order) {
		processOrder.accept(order);
		Optional.ofNullable(next)
			.ifPresent(nextStep -> nextStep.process(order));
	}
}
