package org.e2e.labe2e01.driver.domain;

import org.e2e.labe2e01.coordinate.domain.Coordinate;
import org.e2e.labe2e01.coordinate.infrastructure.CoordinateRepository;
import org.e2e.labe2e01.driver.infrastructure.DriverRepository;
import org.e2e.labe2e01.vehicle.domain.Vehicle;
import org.e2e.labe2e01.vehicle.domain.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DriverService {

    @Autowired
    private DriverRepository driverRepository;

    public Driver getDriverById(Long id) {
        return driverRepository.findById(id).orElse(null);
    }

    public Driver createDriver(Driver driver) {
        return driverRepository.save(driver);
    }

    public void deleteDriver(Long id) {
    Driver driver = driverRepository.findById(id).orElse(null);
    if (driver != null) {
        driverRepository.delete(driver);
    }else {
        throw new RuntimeException("Driver not found");
    }

    }
    public void updateDriverLocation(Long id, Double latitude, Double latitud, Double longitude) {
        Driver driver = driverRepository.findById(id).orElse(null);
        if (driver != null) {
            driver.setCoordinate(new Coordinate(latitude, longitude));
            driverRepository.save(driver);
        }else{
            throw new RuntimeException("Driver not found");
        }
    }

    // Inject dependencies and methods
}
