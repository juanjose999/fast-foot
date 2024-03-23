package com.comidas.rapidas.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.LinkedList;
import java.util.Queue;
@Data
@NoArgsConstructor
@Document(collection = "orderFinished")
public class OrderFinished {
    public static OrderFinished instance;
    private Queue<OrderFinished> orderFinished;

    public OrderFinished(Queue<OrderFinished> orderFinished) {
        this.orderFinished = new LinkedList<>();
    }



}
