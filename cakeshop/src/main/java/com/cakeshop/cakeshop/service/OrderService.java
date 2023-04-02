package com.cakeshop.cakeshop.service;

import com.cakeshop.cakeshop.model.Order;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    private final CakeService cakeService;

    public OrderService(CakeService cakeService) {
        this.cakeService = cakeService;
    }

    public List<Order> getOrders(){

        return List.of(
                new Order(1, 12.50, cakeService.getCakes())
        );
    }
}
