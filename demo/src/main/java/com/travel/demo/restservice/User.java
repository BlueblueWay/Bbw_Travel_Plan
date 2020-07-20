package com.travel.demo.restservice;

public class User {
    private String name;
    private final long id;
    private final String content;

    public User(String name, long id, String content) {
        this.name = name;
        this.id = id;
        this.content = content;
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

    public String getContent() {
        return content;
    }

    @Override
    public String toString() {
        return "Greeting [name=" + name + ", id=" + id + ", content=" + content + "]";
    }
    





}