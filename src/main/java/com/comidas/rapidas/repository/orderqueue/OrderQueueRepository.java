package com.comidas.rapidas.repository.orderqueue;

import com.comidas.rapidas.entity.OrderQueue;

import java.util.List;
import java.util.Optional;

public interface OrderQueueRepository {
    List<OrderQueue> getAllOrdersQueue();
    Optional<OrderQueue> findOrderQueueById(String idOrderQueue);
    OrderQueue saveOrder(OrderQueue orderQueue);
    OrderQueue updateOrderQueue(String idOrderQueue, OrderQueue orderQueue);
    Boolean deleteOrderQueueById(String idOrderQueue);
}
