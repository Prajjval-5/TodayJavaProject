package com.springboot.project.assignment.controller;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.project.assignment.order.Order;
import com.springboot.project.assignment.service.OrderService;




@RestController
@RequestMapping("/api/orders") //http://localhost:8080/api/orders -- REST URI
public class Controller {
    
    //DI
    private OrderService orderservice;



   //Constructor injection
    public Controller(OrderService orderservice) {
        super();
        this.orderservice = orderservice;
    }
    
    //Build create order REST API
    @PostMapping()
    public ResponseEntity<Order> saveOrder(@RequestBody Order order){
        return new ResponseEntity<Order>
        (orderservice.saveOrder(order), HttpStatus.CREATED);
    }
    
    //build get all order Rest API
    @GetMapping
    public List<Order> getAllOrder()
    {
        return orderservice.getAllOrder();
    }
    
    //build get order by id Rest Api
    //http://localhost:8080/api/orders/id}
    
    @GetMapping("{id}")
    public ResponseEntity<Order> getOrderById(@PathVariable("id") long orderId)
    {
     return new ResponseEntity<Order>(orderservice.getOrderById(orderId), HttpStatus.OK);    
    }
    
    //build update employee Rest API
    //http://Localhost:8080/api/orders/{id}
    @PutMapping("{id}")
    public ResponseEntity<Order> updateOrder(@PathVariable("id")long id,
            @RequestBody Order order)
    {
        return new ResponseEntity<Order>(orderservice.updateOrder(order, id),HttpStatus.OK);
    }
    
    //Build delete order Rest API
    //http:localhost:8080/api/orders/{id}
    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteOrder(@PathVariable("id")long id)
    {
        //delete
    	orderservice.deleteOrder(id);
        return new ResponseEntity<String>("order deleted Successfully!",HttpStatus.OK);
    }
}