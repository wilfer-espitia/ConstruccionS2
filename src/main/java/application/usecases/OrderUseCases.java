package application.usecases;
import application.domain.models.Order;
import application.domain.services.OrderService;
import java.util.List;
import java.util.Optional;

public class OrderUseCases {
    private final OrderService orderService;

    public OrderUseCases(OrderService orderService) {
        this.orderService = orderService;
    }

    public Order saveOrder(Order order) {
        return orderService.save(order);
    }

    public Optional<Order> findOrderById(String id) {
        return orderService.findById(id);
    }

    public List<Order> findAllOrders() {
        return orderService.findAll();
    }

    public void deleteOrder(String id) {
        orderService.deleteById(id);
    }
}