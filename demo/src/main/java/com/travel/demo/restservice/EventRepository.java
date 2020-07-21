package com.travel.demo.restservice;

import java.util.List;

import org.springframework.data.repository.CrudRepository;



public interface EventRepository extends CrudRepository<Event, Long> {

    public List<Event> findByUserId(long id);
}