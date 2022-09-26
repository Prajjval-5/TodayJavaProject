package com.springboot.project.assignment.service;

import java.util.List;

import com.springboot.project.assignment.order.Order;



public interface OrderService {

	 Order saveOrder(Order order);
	    //FindALL
	    List<Order> getAllOrder();
	    //FindByID
	    Order getOrderById(long id);
	    //Update
	    Order updateOrder(Order order, long id);
	    //Delete
	    void deleteOrder(long id);
}
