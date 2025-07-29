package com.order.OrderService.model;

import org.apache.catalina.User;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "orders")
public class Order {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int OrderId;
	private String productName;
	private int quantity;
	private int userId;
	
	public Order(){};
	
	public int getOrderId() {
		return OrderId;
	}
	
	public String getProductName() {
		return productName;
	}
	public int getQuantity() {
		return quantity;
	}
	public int getUserId() {
		return userId;
	}
	public void setOrderId(int orderId) {
		OrderId = orderId;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	public Order(int orderId, String productName, int quantity, int userId) {
	
		this.OrderId = orderId;
		this.productName = productName;
		this.quantity = quantity;
		this.userId = userId;
	}
	

}
