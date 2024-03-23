package com.comidas.rapidas.repository.order;

import com.comidas.rapidas.entity.Order;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

public interface OrderRepository {
    List<Order> getAllOrders();
    Optional<Order> findOrderById(String idOrder);
    Order saveOrder(Order order);
    Order updateOrder(String idOrder, Order order);
    Boolean deleteOrderById(String idOrder);
}
