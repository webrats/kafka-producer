package com.kafka_producer.producer.Entity;

import java.math.BigDecimal;

public class ProductEvent {
	private String productId ;
	private String title;
	private BigDecimal price;
	private int quantity;
	
	
	public ProductEvent() {
		super();
		
	}
	
	
	
	public ProductEvent(String productId, String title, BigDecimal price, int quantity) {
		super();
		this.productId = productId;
		this.title = title;
		this.price = price;
		this.quantity = quantity;
	}



	public String getProductId() {
		return productId;
	}



	public void setProductId(String productId) {
		this.productId = productId;
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



	
}
