package com.pblgllgs.model;
/*
 *
 * @author pblgl
 * Created on 16-11-2023
 *
 */

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Location {

    @Id
    @GeneratedValue
    private Long id;
    private String lat;
    private String log;

    public Location(String lat, String log) {
        this.lat = lat;
        this.log = log;
    }

    public Location() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLog() {
        return log;
    }

    public void setLog(String log) {
        this.log = log;
    }
}
