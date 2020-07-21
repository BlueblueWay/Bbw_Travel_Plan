package com.travel.demo.restservice;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
    private String name;
    @Id
    private long id;
    private String birthday;

    public User() {

    }

    public User(String name, long id, String birthday) {
        this.name = name;
        this.id = id;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public String getBirthday() {
        return birthday;
    }

    @Override
    public String toString() {
        return "Greeting [name=" + name + ", id=" + id + ", content=" + birthday + "]";
    }
    





}