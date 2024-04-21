package org.e2e.labe2e01.driver.application;


import org.e2e.labe2e01.driver.domain.Driver;
import org.e2e.labe2e01.driver.domain.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.filter.RequestContextFilter;


@RestController
@RequestMapping("/driver")
public class DriverController {

    @Autowired
    private DriverService driverService;
    @Autowired
    private RequestContextFilter requestContextFilter;

    @GetMapping("/{id}")
    public  ResponseEntity<Driver> getDriver(@PathVariable Long id) {
        return new ResponseEntity<>(driverService.getDriverById(id), HttpStatus.OK);
    }

    @PostMapping()
    public  ResponseEntity<Driver> createDriver(@RequestBody Driver driver) {
        return new ResponseEntity<>(driverService.createDriver(driver), HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void>deleteDriver(@PathVariable Long id) {
        driverService.deleteDriver(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
    @PatchMapping("{/id}/location")
    public void updateDriver(@PathVariable Long id, @RequestBody Driver driver) {

    }
    // endpoints (see README)
}
