package application.domain.ports;
import application.domain.models.Review;

import java.util.List;
import java.util.Optional;

public interface ReviewRepository {

     Review save(Review review);

    Optional<Review> findById(Long id);

    List<Review> findAll();

    List<Review> findByProductId(String productId);

    List<Review> findByCustomerId(String customerId);

    void deleteById(Long id);
    
}
