package application.domain.models;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter

public class Seller extends Person  {

    private String sellerId;
    private String sellerCode;
    private String storeName;
    private LocalDate registrationDate;
    private boolean active;
    private List<String> productIds = new ArrayList<>();

    public Seller() {
        this.active = true;
        this.registrationDate = LocalDate.now();
    }

    public void addProduct(String productId) {
        productIds.add(productId);
    }
    
}
