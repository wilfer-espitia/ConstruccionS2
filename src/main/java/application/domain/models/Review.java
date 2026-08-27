package application.domain.models;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class Review {
    
    private Long id;

    private String productId;

    private String customerId;

    private int rating;

    private String comment;

    private LocalDateTime createdAt = LocalDateTime.now();
}
