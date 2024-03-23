package com.comidas.rapidas.service.order;

import com.comidas.rapidas.entity.Order;

import java.util.List;
import java.util.Optional;

public interface OrderService {

    List<Order> getAllOrders();
    Optional<Order> findOrderById(String idOrder);
    Order saveOrder(Order order);
    Order updateOrder(String idOrder, Order order);
    Boolean deleteOrderById(String idOrder);

}
