package application.domain.models;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter

public class Custorme extends Person  {

    private String customerId;
    private String customerCode;
    private LocalDate registrationDate;
    private boolean active;
    private List<String> orderIds = new ArrayList<>();
    private String cartId;

    public Custorme() { 
        this.active = true;
        this.registrationDate = LocalDate.now();
    }

    public void addOrder(String orderId) {
        orderIds.add(orderId);
    }
    
}
