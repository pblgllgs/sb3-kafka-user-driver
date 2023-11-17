package com.pblgllgs.service;
/*
 *
 * @author pblgl
 * Created on 16-11-2023
 *
 */

import com.pblgllgs.repository.LocationRepository;
import com.pblgllgs.model.Location;
import org.springframework.stereotype.Service;

@Service
public class LocationService {

    private final LocationRepository locationRepository;

    public LocationService(LocationRepository locationRepository) {
        this.locationRepository = locationRepository;
    }

    public void saveMessages(Location location){
        locationRepository.save(location);
    }
}
