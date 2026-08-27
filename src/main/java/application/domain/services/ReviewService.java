package application.domain.services;
import application.domain.models.Review;
import application.domain.ports.ReviewRepository;

import java.util.List;
import java.util.Optional;

public class ReviewService {

    private final ReviewRepository reviewRepository;

    public ReviewService(ReviewRepository reviewRepository) {
        this.reviewRepository = reviewRepository;
    }

    public Review save(Review review) {
        return reviewRepository.save(review);
    }

public Optional<Review> findById(Long id) {
    return reviewRepository.findById(id);
}

    public List<Review> findAll() {
        return reviewRepository.findAll();
    }

    public void deleteById(Long id) {
    reviewRepository.deleteById(id);

}
    
}
