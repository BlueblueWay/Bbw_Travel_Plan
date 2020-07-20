package com.travel.demo.restservice;

import org.springframework.data.repository.CrudRepository;



public interface EventRepository extends CrudRepository<Event, Long> {
    
}