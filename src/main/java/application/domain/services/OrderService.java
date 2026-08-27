package application.domain.services;
import application.domain.models.Order;
import application.domain.ports.OrderRepository;

import java.util.List;
import java.util.Optional;

public class OrderService {
    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public Order save(Order order) {
        return orderRepository.save(order);
    }

    public Optional<Order> findById(String id) {
        return orderRepository.findById(id);
    }

    public List<Order> findAll() {
        return orderRepository.findAll();
    }

    public void deleteById(String id) {
        orderRepository.deleteById(id);
    }
    
}
