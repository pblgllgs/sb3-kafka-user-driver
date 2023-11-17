package com.pblgllgs.service;
/*
 *
 * @author pblgl
 * Created on 16-11-2023
 *
 */

import com.pblgllgs.constant.Constant;
import com.pblgllgs.model.Location;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class LocationService {

    private final KafkaTemplate<String, Location> kafkaTemplate;

    public LocationService(KafkaTemplate kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendLocation(Location location){
        kafkaTemplate.send(Constant.LOCATION,location);
    }
}
