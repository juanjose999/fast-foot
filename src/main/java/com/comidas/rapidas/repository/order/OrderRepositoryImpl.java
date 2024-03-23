package com.comidas.rapidas.repository.order;

import com.comidas.rapidas.entity.Menu;
import com.comidas.rapidas.entity.Order;
import com.comidas.rapidas.entity.OrderQueue;
import com.comidas.rapidas.repository.menu.MenuRepository;
import com.comidas.rapidas.repository.orderqueue.OrderQueueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public class OrderRepositoryImpl implements OrderRepository{

    @Autowired
    private OrderMongoRepository orderMongoRepository;

    @Autowired
    private MenuRepository menuRepository;

    @Autowired
    private OrderQueueRepository orderQueueRepository;

    @Override
    public List<Order> getAllOrders() {
        return orderMongoRepository.findAll();
    }

    @Override
    public Optional<Order> findOrderById(String idOrder) {
        return orderMongoRepository.findById(idOrder);
    }

    @Override
    public Order saveOrder(Order order) {
        Menu menu = order.getMenu();
        Menu savedMenu = menuRepository.saveMenu(menu);
        order.setMenu(savedMenu);

        Order saveOrder = orderMongoRepository.save(order);

        OrderQueue orderList = OrderQueue.getInstance();
        orderList.addToList(saveOrder);
        orderQueueRepository.saveOrder(orderList);
        return saveOrder;
    }

    @Override
    public Order updateOrder(String idOrder, Order order) {
        Optional<Order> findOrderToUpdate = orderMongoRepository.findById(idOrder);
        if(findOrderToUpdate.isPresent()){
            Order orderExisting = findOrderToUpdate.get();
            orderExisting.setMenu(order.getMenu());
            orderExisting.setOrderStatus(order.getOrderStatus());
            orderExisting.setOrderCreationDate(order.getOrderCreationDate());
            return orderMongoRepository.save(orderExisting);
        }
        throw new RuntimeException("The order with id: " + idOrder + " not found in data base.");
    }

    @Override
    public Boolean deleteOrderById(String idOrder) {
        Optional<Order> findOrder = orderMongoRepository.findById(idOrder);
        if(findOrder.isPresent()){
            orderMongoRepository.delete(findOrder.get());
            return true;
        }
        return false;
    }
}
