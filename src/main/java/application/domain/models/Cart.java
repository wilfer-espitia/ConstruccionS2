package application.domain.models;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter

public class Cart {

    private String id;
    private String customerId;
    private List<CartItem> items = new ArrayList<>();

    public double getTotal() {

        return items.stream()
                .filter(item -> item != null)
                .mapToDouble(CartItem::getSubtotal)
                .sum();
    }
    
}
