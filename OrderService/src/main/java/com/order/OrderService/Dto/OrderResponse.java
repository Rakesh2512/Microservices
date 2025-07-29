package com.order.OrderService.Dto;

import org.springframework.beans.factory.annotation.Autowired;

import com.order.OrderService.model.Order;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


public class OrderResponse {
	
	
	private Order order;
	private User user;
	
	public OrderResponse() {};
	
	public Order getOrder() {
		return order;
	}


	public User getUser() {
		return user;
	}


	public void setOrder(Order order) {
		this.order = order;
	}


	public void setUser(User user) {
		this.user = user;
	}

	
	
	public OrderResponse(Order order, User user) {
        this.order = order;
        this.user = user;
    }
	
	
	

}
