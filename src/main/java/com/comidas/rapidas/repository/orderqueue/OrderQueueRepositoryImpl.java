package com.comidas.rapidas.repository.orderqueue;

import com.comidas.rapidas.entity.OrderQueue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class OrderQueueRepositoryImpl implements OrderQueueRepository{
    @Autowired
    private OrderQueueMongoRepository orderQueueMongoRepository;
    @Override
    public List<OrderQueue> getAllOrdersQueue() {
        return orderQueueMongoRepository.findAll();
    }

    @Override
    public Optional<OrderQueue> findOrderQueueById(String idOrderQueue) {
        return orderQueueMongoRepository.findById(idOrderQueue);
    }

    @Override
    public OrderQueue saveOrder(OrderQueue orderQueue) {
        return orderQueueMongoRepository.save(orderQueue);
    }

    @Override
    public OrderQueue updateOrderQueue(String idOrderQueue, OrderQueue orderQueue) {
        Optional<OrderQueue> findOrderQueue = orderQueueMongoRepository.findById(idOrderQueue);
        /*if(findOrderQueue.isPresent()){
            OrderQueue existingOrderQueue = findOrderQueue.get();
            existingOrderQueue.setOrderQueue(orderQueue.getOrderQueue());
            return orderQueueMongoRepository.save(existingOrderQueue);
        }*/
        throw new RuntimeException("Orderqueue with id: " + idOrderQueue + " not existing in data base.");
    }

    @Override
    public Boolean deleteOrderQueueById(String idOrderQueue) {
        Optional<OrderQueue> findOrderQueue = orderQueueMongoRepository.findById(idOrderQueue);
        if(findOrderQueue.isPresent()){
            orderQueueMongoRepository.delete(findOrderQueue.get());
            return true;
        }
        return false;
    }
}
