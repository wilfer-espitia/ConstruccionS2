package application.domain.models;
import application.domain.models.enums.ProductStatus;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
public class Product {
     private String id = UUID.randomUUID().toString();
    private String name;
    private String description;
    private double price;
    private int stock;
    private ProductStatus status = ProductStatus.ACTIVE;
    private String sellerId;
    private String categoryId;
    private LocalDateTime createdAt = LocalDateTime.now();

    public void reduceStock(int quantity) {

        if (quantity <= 0) {
            throw new IllegalArgumentException(
                    "La cantidad debe ser positiva"
            );
        }

        if (quantity > stock) {
            throw new IllegalStateException(
                    "Stock insuficiente"
            );
        }

        stock -= quantity;

        if (stock == 0) {
            status = ProductStatus.OUT_OF_STOCK;
        }
    }

    public void increaseStock(int quantity) {

        if (quantity <= 0) {
            throw new IllegalArgumentException(
                    "La cantidad debe ser positiva"
            );
        }

        stock += quantity;

        if (status == ProductStatus.OUT_OF_STOCK) {
            status = ProductStatus.ACTIVE;
        }
    }
    
}
