package com.comidas.rapidas.order;

import java.util.HashMap;
import java.util.Map;

public class FakeDataOrder {
    public static Order crearOrder(){
        Order firstOrder = new Order();
        firstOrder.setId("1");
        Map<String, Integer> order = new HashMap<>();
        order.put("Perro sencillo", 2);
        order.put("Hamburgesa de pollo", 1);
        order.put("Arepa mixta", 1);
        firstOrder.setOrder(order);
        return firstOrder;
    }

    public static Order crearOrderTwo(){
        Order firstOrder = new Order();
        firstOrder.setId("1");
        Map<String, Integer> order = new HashMap<>();
        order.put("Perro sencillo", 4);
        order.put("Hamburgesa de pollo", 0);
        order.put("Arepa mixta", 2);
        firstOrder.setOrder(order);
        return firstOrder;
    }
}
