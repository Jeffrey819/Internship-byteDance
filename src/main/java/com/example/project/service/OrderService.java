package com.example.project.service;

import com.example.project.entity.Order;
import com.example.project.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;

    public void save(Order order) {
        orderRepository.save(order);
    }

    public Optional<Order> findByOrderId(String orderId) {
        Optional<Order> order = orderRepository.findById(orderId);
        return order;
    }

    public Optional<List<Order>> findByCustomerId(String customerId) {
        Optional<List<Order>> orders = orderRepository.findByCustomerId(customerId);
        return orders;
    }

    public void deleteByOrderId(String orderId) {
        orderRepository.deleteById(orderId);
    }

}