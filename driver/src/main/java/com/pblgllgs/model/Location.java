package com.pblgllgs.model;
/*
 *
 * @author pblgl
 * Created on 16-11-2023
 *
 */

public class Location {

    private String lat;
    private String log;

    public Location(String lat, String log) {
        this.lat = lat;
        this.log = log;
    }

    public Location() {
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
