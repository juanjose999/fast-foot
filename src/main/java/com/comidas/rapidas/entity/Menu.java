package com.comidas.rapidas.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serial;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "menu")
public class Menu implements Serializable {
    @Serial
    private final static long serialVersionUID = 1L;
    @Id
    private String id;
    private HashMap<String, Integer> orderList;

    public Menu(HashMap<String, Integer> orderList) {
        this.orderList = orderList;
    }
}
