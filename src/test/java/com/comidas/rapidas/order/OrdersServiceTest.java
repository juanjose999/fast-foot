package com.comidas.rapidas.order;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.util.*;
import java.util.List;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.jsonPath;

public class OrdersServiceTest {/*
    @Mock
    OrdersServiceTest ordersServices;
    @Test
    public void test_readOrderById(){
        Order firstOrder = FakeDataOrder.crearOrder();

        when(ordersServices.getOrderById("1")).thenReturn(firstOrder);

        mockMvc.perform(get(BASE_URL + "/1"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.id", is("1")))
                .andExpect(jsonPath("$.order", hasKey("Perro sencillo")))
                .andExpect(jsonPath("$.order.Perro sencillo", is(2)))
                .andExpect(jsonPath("$.order", hasKey("Hamburguesa de pollo")))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.order.Hamburguesa de pollo", is(1)))
                .andExpect(jsonPath("$.order", hasKey("Arepa mixta")))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.order.Arepa mixta", is(1)));

                verify(ordersServices .times(1)).findOrderById("1");
    }


    @Test
    public void test_readAllOrders(){
        Order firstOrder = FakeDataOrder.crearOrder();
        Order twoOrder = FakeDataOrder.crearOrderTwo();
        List<Order> orderList = new ArrayList<>();
        orderList.add(firstOrder);
        orderList.add(twoOrder);

        when(ordersServices.getAllOrders()).thenReturn(orderList);

        verify(ordersServices .times(1)).getAllOrders();
    }


    @Test
    public void test_saveNewOrder(){
        Order orderNew = FakeDataOrder.crearOrder();

        when(ordersServices.saveOrder()).thenReturn(orderNew);

        verify(ordersServices .times(1)).saveOrder();

        Order resultSimulation = ordersServices.saveOrder(orderNew);

        verify(ordersServices .times(1)).saveOrder(orderNew);
        assertEquals(orderNew, resultSimulation);
    }

    @Test
    public void test_actualizarPedido(){
        Order orderNew = FakeDataOrder.crearOrder();

        Map<String, Integer> updateOrder = new HashMap<>();
        pedido.put("Perro mixto", 1);
        pedido.put("Hamburguesa mixta", 2);
        pedido.put("Arepa mixta", 1);

        when(ordersServices.updateOrder(orderNew)).thenReturn(orderNew);

        mockMvc.perform(put(BASE_URL + "/1")).contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(updateOrder))
                        .andExpect(status().isOk());

        verify(orderService. times(1)).saveOrder(orderNew);
    }

    @Test
    public void test_borrarPedido(){
        Order orderNew = FakeDataOrder.crearOrder();

        String idDelete = "1";

        when(ordersServices.deleteOrderById(1)).thenReturn(true);

        mockMvc.perform(MockMvcRequestBuilders.delete(BASE_URL + "/1"))
                        .andExcept(MockMvcResultMatchers.status().isOk());

        verify(ordersServices .times(1)).deletePedidoById("1");
    }
    */
}
