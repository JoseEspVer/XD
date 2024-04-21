package org.e2e.labe2e01.review.infrastructure;

import org.e2e.labe2e01.review.domain.Review;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;

public interface ReviewRepository extends JpaRepository<Review, Long> {
    Set<Review> findByRating(int i);

    Set<Review> findByAuthor_Id(Long id);

    Long countByAuthor_Id(Long id);
}
