package com.order.OrderService.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.order.OrderService.model.Order;


@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {

}
