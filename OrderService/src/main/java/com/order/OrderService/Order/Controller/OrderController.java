package com.order.OrderService.Order.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.client.ResourceAccessException;
import org.springframework.web.client.RestTemplate;

import com.order.OrderService.Dto.OrderResponse;
import com.order.OrderService.Dto.User;
import com.order.OrderService.Repository.OrderRepository;
import com.order.OrderService.model.Order;

import CustomeException.OrderNotFoundException;
import ErrorResponseHandle.ErrorResponse;

@RestController
@RequestMapping("/orders")
public class OrderController {
	
	@Autowired
	public OrderRepository orderRepository;
	
	@Autowired
	public RestTemplate restTemplate;
	
	
	@Value("${user.service.url}")
	private String userServiceUrl;
	
	
	@PostMapping("/CreateOrder")
	public Order createOrder(@RequestBody Order order) {
		return orderRepository.save(order);
	}
	
	@GetMapping("/{id}")
	public Order getProductByUser(@PathVariable int id){
		
		return orderRepository.findById(id).orElseThrow(() -> new OrderNotFoundException("Order is found by :"+id));
		
	}
	
	@GetMapping("/test")
	public OrderResponse testResponse() {
	    return new OrderResponse(
	        new Order(1, "TestProduct", 2, 100),
	        new User(100, "Rakesh", "rakesh@example.com")
	    );
	}
	
	

}
