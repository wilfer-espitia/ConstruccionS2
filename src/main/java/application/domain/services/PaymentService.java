package application.domain.services;
import application.domain.models.Payment;
import application.domain.ports.PaymentRepository;

import java.util.List;
import java.util.Optional;

public class PaymentService {
    private final PaymentRepository paymentRepository;

    public PaymentService(PaymentRepository paymentRepository) {
        this.paymentRepository = paymentRepository;
    }

    public Payment save(Payment payment) {
        return paymentRepository.save(payment);
    }

    public Optional<Payment> findById(String id) {
        return paymentRepository.findById(id);
    }

    public List<Payment> findAll() {
        return paymentRepository.findAll();
    }

    public void deleteById(String id) {
        paymentRepository.deleteById(id);
    }
    
}
