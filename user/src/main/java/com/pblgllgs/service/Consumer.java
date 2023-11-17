package com.pblgllgs.service;
/*
 *
 * @author pblgl
 * Created on 16-11-2023
 *
 */

import com.pblgllgs.model.Location;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {

    private final LocationService locationService;

    public Consumer(LocationService locationService) {
        this.locationService = locationService;
    }

    @KafkaListener(groupId = "pblgllgs",topics = "location")
    public void listener(Location message){
        locationService.saveMessages(message);
    }
}
