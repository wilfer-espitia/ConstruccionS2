package application.domain.models;

import application.domain.models.enums.OrderStatus;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
public class Order {
    
    private String id = UUID.randomUUID().toString();

    private String customerId;

    private List<OrderItem> items = new ArrayList<>();

    private double total;

    private OrderStatus status = OrderStatus.PENDING;

    private String shippingAddress;

    private LocalDateTime createdAt = LocalDateTime.now();

    private String paymentId;

    public void calculateTotal() {

        total = items.stream()
                .filter(item -> item != null)
                .mapToDouble(OrderItem::getSubtotal)
                .sum();
    }
    
}
