package application.domain.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Address {
     private Long id;
    private String customerId;
    private String alias;
    private String street;
    private String city;
    private String department;
    private String postalCode;
    private boolean defaultAddress;
    
}
