package com.travel.demo.restservice;

// import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Event {

    private String city;
    private String lcation;
    @Id
    private long eid;
    private int openDate;
    @ManyToOne
    User user;
    // create another object and use @ManyToOne etc.h

    public Event() {

    }

    public Event(String city, String lcation, long id, int openDate) {
        this.city = city;
        this.lcation = lcation;
        this.eid = id;
        this.openDate = openDate;
    }

    public int getOpenDate() {
        return openDate;
    }

    public void setOpenDate(int openDate) {
        this.openDate = openDate;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getLcation() {
        return lcation;
    }

    public void setLcation(String lcation) {
        this.lcation = lcation;
    }

    public long getId() {
        return eid;
    }

    public void setId(long id) {
        this.eid = id;
    }

    

}