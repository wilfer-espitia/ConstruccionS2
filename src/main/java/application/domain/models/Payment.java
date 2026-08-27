package application.domain.models;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.UUID;

import application.domain.models.enums.PaymentStatus;

@Getter
@Setter
public class Payment {
    private String id = UUID.randomUUID().toString();

    private String orderId;

    private double amount;

    private String method;

    private PaymentStatus status = PaymentStatus.PENDING;

    private LocalDateTime paymentDate = LocalDateTime.now();
}
    

