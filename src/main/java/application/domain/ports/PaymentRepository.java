package application.domain.ports;

import application.domain.models.Payment;

import java.util.List;
import java.util.Optional;

public interface PaymentRepository {

    Payment save(Payment payment);

    Optional<Payment> findById(String id);

    Optional<Payment> findByOrderId(String orderId);

    List<Payment> findAll();

    void deleteById(String id);
}
