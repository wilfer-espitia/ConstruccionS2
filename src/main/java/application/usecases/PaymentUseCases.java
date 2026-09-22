package application.usecases;
import application.domain.models.Payment;
import application.domain.services.PaymentService;
import java.util.List;
import java.util.Optional;

public class PaymentUseCases {
    private final PaymentService paymentService;

    public PaymentUseCases(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public Payment savePayment(Payment payment) {
        return paymentService.save(payment);
    }

    public Optional<Payment> findPaymentById(String id) {
        return paymentService.findById(id);
    }

    public List<Payment> findAllPayments() {
        return paymentService.findAll();
    }

    public void deletePayment(String id) {
        paymentService.deleteById(id);
    }
}