package com.springboot.project.assignment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.project.assignment.order.Order;


public interface OrderRepository extends JpaRepository<Order, Long>{
	
}
