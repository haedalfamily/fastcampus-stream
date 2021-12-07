package com.fastcampus.functionalprogramming.chapter6.model;

import java.math.BigDecimal;

public class OrderLine {
	private long id;
	private OrderLineType type;
	private long productId;
	private int quantity;
	private BigDecimal amount;
	
	public enum OrderLineType {
		PURCHASE,
		DISCOUNT
	}

	public long getId() {
		return id;
	}

	public OrderLine setId(long id) {
		this.id = id;
		return this;
	}
	
	public OrderLineType getType() {
		return type;
	}
	
	public OrderLine setType(OrderLineType type) {
		this.type = type;
		return this;
	}

	public long getProductId() {
		return productId;
	}

	public OrderLine setProductId(long productId) {
		this.productId = productId;
		return this;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public OrderLine setQuantity(int quantity) {
		this.quantity = quantity;
		return this;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public OrderLine setAmount(BigDecimal amount) {
		this.amount = amount;
		return this;
	}

	@Override
	public String toString() {
		return "OrderLine [id=" + id + ", " + (type != null ? "type=" + type + ", " : "") + "productId=" + productId
				+ ", quantity=" + quantity + ", " + (amount != null ? "amount=" + amount : "") + "]";
	}
}
