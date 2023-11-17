package com.pblgllgs.controller;
/*
 *
 * @author pblgl
 * Created on 16-11-2023
 *
 */

import com.pblgllgs.model.Location;
import com.pblgllgs.service.LocationService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/location")
public class LocationController {

    private final LocationService locationService;

    public LocationController(LocationService locationService) {
        this.locationService = locationService;
    }

    @PutMapping
    public ResponseEntity<Map<String,String>> updateLocation() throws InterruptedException {
        int range = 10;
        while (range > 0){
            Location location = new Location(String.valueOf(Math.random()),String.valueOf(Math.random()));
            locationService.sendLocation(location);
            range --;
        }
        return new ResponseEntity<>(Map.of("message", "Location updated!!"), HttpStatus.OK);
    }
}
