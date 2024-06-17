package com.kafka_producer.producer.service;

import java.util.UUID;
import java.util.concurrent.CompletableFuture;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Service;

import com.kafka_producer.producer.Entity.Product;
import com.kafka_producer.producer.Entity.ProductEvent;



@Service
public class ProductService {
	Logger LOG = LoggerFactory.getLogger(this.getClass());
	KafkaTemplate<String, ProductEvent> kafka ;
	
	public ProductService(KafkaTemplate<String, ProductEvent> kafka) {
		super();
		this.kafka = kafka;
	}



	public String createProduct(Product product) {

		String productId = UUID.randomUUID().toString();
		ProductEvent productEvent = new ProductEvent(productId,product.getTitle(),product.getPrice(),product.getQuantity());
		CompletableFuture<SendResult<String, ProductEvent>> future = kafka.send("product-created-event-topic",productId, productEvent);
		
		future.whenComplete((result,ex)->{
			if(ex != null) {
				LOG.debug("**** Not Able to send the the topic "+ ex.getMessage());
			}else {
				LOG.debug("**** Topic send successfully "+ result.getRecordMetadata());
			}
		});
		return productId ;
	}
}
