package org.e2e.labe2e01.review.application;

import org.e2e.labe2e01.review.domain.Review;
import org.e2e.labe2e01.review.domain.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/review")
public class ReviewController {

    @Autowired
    private ReviewService reviewService;

    // Endpoints (see README)
}
