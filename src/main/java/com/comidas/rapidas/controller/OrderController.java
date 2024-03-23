package com.comidas.rapidas.controller;

import com.comidas.rapidas.entity.Order;
import com.comidas.rapidas.service.order.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/order")
@CrossOrigin(origins = "*")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @GetMapping
    public ResponseEntity<List<Order>> getAllOrders(){
        return new ResponseEntity<>(orderService.getAllOrders(), HttpStatus.OK);
    }

    @PostMapping("/save-order")
    public ResponseEntity<Order> saveOrder(@RequestBody Order order){
        return new ResponseEntity<>(orderService.saveOrder(order),HttpStatus.CREATED);
    }

}
