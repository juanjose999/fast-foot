package com.comidas.rapidas.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

@Data

@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "orders")
public class Order implements Serializable {

    @Serial
    private final static long serialVersionUID = 1L;
    @Id
    private String idOrder;
    @DBRef
    private Menu menu;
    public String orderCreationDate;
    private String orderStatus = "Pending";

    public Order(Menu menu) {
        this.menu = menu;
        orderCreationDate = getOrderCreationDate();
        this.orderStatus = "Pending";
    }

    public String getOrderCreationDate(){
        LocalDateTime currentDate = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd : HH:mm");
        return currentDate.format(formatter);
    }
}
