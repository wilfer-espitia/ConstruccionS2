package application.domain.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CartItem {
     private Long id;
    private String productId;
    private int quantity;
    private double unitPrice;

    public double getSubtotal() {

        return unitPrice * quantity;
    }
    
}
