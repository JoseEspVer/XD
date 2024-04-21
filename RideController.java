package org.e2e.labe2e01.ride.application;


import org.e2e.labe2e01.ride.domain.Ride;
import org.e2e.labe2e01.ride.domain.RideService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ride")
public class RideController {
    @Autowired
    private RideService rideService;

    // Endpoints (see README)

}
