package com.comidas.rapidas.service.order;

import com.comidas.rapidas.controller.MenuController;
import com.comidas.rapidas.entity.Menu;
import com.comidas.rapidas.entity.Order;
import com.comidas.rapidas.repository.menu.MenuRepository;
import com.comidas.rapidas.repository.order.OrderRepository;
import com.comidas.rapidas.service.menu.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public List<Order> getAllOrders() {
        return new ArrayList<>(orderRepository.getAllOrders());
    }

    @Override
    public Optional<Order> findOrderById(String idOrder) {
        return orderRepository.findOrderById(idOrder);
    }

    @Override
    public Order saveOrder(Order order) {
        return orderRepository.saveOrder(order);
    }

    @Override
    public Order updateOrder(String idOrder, Order order) {
        return orderRepository.updateOrder(idOrder, order);
    }

    @Override
    public Boolean deleteOrderById(String idOrder) {
        return orderRepository.deleteOrderById(idOrder);
    }
}
