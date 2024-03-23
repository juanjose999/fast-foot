package com.comidas.rapidas.service.orderqueue;

import com.comidas.rapidas.entity.OrderQueue;
import com.comidas.rapidas.repository.orderqueue.OrderQueueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class OrderQueueServiceImpl implements OrderQueueService{
    @Autowired
    private OrderQueueRepository orderQueueRepository;
    @Override
    public List<OrderQueue> getAllOrdersQueue() {
        return orderQueueRepository.getAllOrdersQueue();
    }
    @Override
    public Optional<OrderQueue> findOrderQueueById(String idOrderQueue) {
        return orderQueueRepository.findOrderQueueById(idOrderQueue);
    }

    @Override
    public OrderQueue saveOrder(OrderQueue orderQueue) {
        return orderQueueRepository.saveOrder(orderQueue);
    }

    @Override
    public OrderQueue updateOrderQueue(String idOrderQueue, OrderQueue orderQueue) {
        return orderQueueRepository.updateOrderQueue(idOrderQueue, orderQueue);
    }

    @Override
    public Boolean deleteOrderQueueById(String idOrderQueue) {
        return orderQueueRepository.deleteOrderQueueById(idOrderQueue);
    }
}
