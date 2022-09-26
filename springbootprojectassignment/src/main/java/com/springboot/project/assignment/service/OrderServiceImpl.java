package com.springboot.project.assignment.service;
import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.project.assignment.exception.ResourceNotFoundException;
import com.springboot.project.assignment.order.Order;
import com.springboot.project.assignment.repository.OrderRepository;




@Service
public class OrderServiceImpl implements OrderService{
    
    //Dependency Injection
    @Autowired
    private OrderRepository orderRepository;
    
    //Constructor injection. ----> store the values.
    public OrderServiceImpl(OrderRepository orderRepository) {
        super();
        this.orderRepository = orderRepository;
    }



   @Override
    public  Order saveOrder(Order  order) {
        return orderRepository.save(order);
    }
    
    @Override
    public List<Order> getAllOrder() {
        return orderRepository.findAll();
    }
    
    @Override
    public Order getOrderById(long id)
    {
        
        return orderRepository.findById(id).orElseThrow( ()->
        new ResourceNotFoundException("order", "Id", id));
    }
    
    @Override
    public Order updateOrder(Order order, long id)
    {
        //We need to check whether order with the given id is exsits in the DB or not
    	Order existingOrder= orderRepository.findById(id).orElseThrow( ()->
                  new ResourceNotFoundException("Order","Id",id));
        
        //if the id found then we need to set the new values to update
    	existingOrder.setOrderName(order.getOrderName());
    	existingOrder.setDate(order.getDate());
    	existingOrder.setOrderTransactionId(order.getOrderTransactionId());
        //save the exiting the order
    	orderRepository.save(existingOrder);
        return existingOrder;
    }
    
    @Override
    public void deleteOrder(long id)
    {
        //we need to check whether order record exists in the DB or not
    	orderRepository.findById(id).orElseThrow( ()->
        new ResourceNotFoundException("order","Id",id));
    	orderRepository.deleteById(id);
        
    }	
}