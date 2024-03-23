package com.comidas.rapidas.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
@Data
@Document(collection = "queueOrder")
public class OrderQueue implements Serializable {
    @Serial
    private final static long serialVersionUID = 1L;
    private static OrderQueue instance;
    @Id
    private String idOrderQueue;
    @DBRef
    private List<Order> orderList;
    private OrderQueue() {
        this.orderList = new ArrayList<>();
    }
    public static synchronized OrderQueue getInstance(){
        if(instance == null) {
            instance = new OrderQueue();
        }
        return instance;
    }
    public void addToList(Order order){
        orderList.add(order);
    }
}
