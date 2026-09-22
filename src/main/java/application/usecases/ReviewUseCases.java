package application.usecases;
import application.domain.models.Review;
import application.domain.services.ReviewService;
import java.util.List;
import java.util.Optional;

public class ReviewUseCases {
    private final ReviewService reviewService;

    public ReviewUseCases(ReviewService reviewService) {
        this.reviewService = reviewService;
    }

    public Review saveReview(Review review) {
        return reviewService.save(review);
    }

    public Optional<Review> findReviewById(Long id) {
        return reviewService.findById(id);
    }

    public List<Review> findAllReviews() {
        return reviewService.findAll();
    }

    public void deleteReview(Long id) {
        reviewService.deleteById(id);
    }
}