package com.comidas.rapidas.controller;

import com.comidas.rapidas.entity.OrderQueue;
import com.comidas.rapidas.service.orderqueue.OrderQueueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/queue")
@CrossOrigin(origins = "*")
public class OrderQueueController {
    @Autowired
    private OrderQueueService orderQueueService;

    @GetMapping
    public ResponseEntity<List<OrderQueue>> getAllOrdersQueue(){
        List<OrderQueue> allOrderQueue = orderQueueService.getAllOrdersQueue();
        return new ResponseEntity<>(allOrderQueue, HttpStatus.OK);
    }

    @PostMapping("/save-orderqueue")
    public ResponseEntity<OrderQueue> saveOrderQueue(@RequestBody OrderQueue orderQueue){
        return new ResponseEntity<>(orderQueueService.saveOrder(orderQueue),HttpStatus.CREATED);
    }
}
