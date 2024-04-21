package org.e2e.labe2e01.review.domain;

import org.e2e.labe2e01.review.infrastructure.ReviewRepository;
import org.e2e.labe2e01.ride.domain.Ride;
import org.e2e.labe2e01.ride.infrastructure.RideRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReviewService {
    @Autowired
    private ReviewRepository reviewRepository;

    // Dependency injection and methods
}
