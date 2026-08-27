package application.domain.ports;

import application.domain.models.Order;

import java.util.List;
import java.util.Optional;

public interface OrderRepository {
    Order save(Order order);

    Optional<Order> findById(String id);

    List<Order> findAll();

    List<Order> findByCustomerId(String customerId);

    void deleteById(String id);
    
}
