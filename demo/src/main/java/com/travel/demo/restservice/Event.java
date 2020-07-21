package com.travel.demo.restservice;

// import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Event {

    private String city;
    private String location;
    @Id
    private long eid;
    private int openTime;
    @ManyToOne
    User user;
    // create another object and use @ManyToOne etc.h

    public Event() {

    }

    public Event(String city, String location, long eid, int openTime, long userId) {
        this.city = city;
        this.location = location;
        this.eid = eid;
        this.openTime = openTime;
        this.user = new User("", userId,"");
    }

    public int getOpenDate() {
        return openTime;
    }

    public void setOpenDate(int openDate) {
        this.openTime = openDate;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getLcation() {
        return location;
    }

    public void setLcation(String lcation) {
        this.location = lcation;
    }

    public long getId() {
        return eid;
    }

    public void setId(long id) {
        this.eid = id;
    }

    

}