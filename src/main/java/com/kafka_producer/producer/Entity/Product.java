package com.kafka_producer.producer.Entity;

import java.math.BigDecimal;

public class Product {

	private String title;
	private BigDecimal price;
	private int quantity;
	
	
	public Product() {
		super();
		
	}
	public Product(String title, BigDecimal price, int quantity) {
		super();
		this.title = title;
		this.price = price;
		this.quantity = quantity;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Product [title=" + title + ", price=" + price + ", quantity=" + quantity + "]";
	}
	
	
	
}
