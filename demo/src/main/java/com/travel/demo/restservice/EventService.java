package com.travel.demo.restservice;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EventService {

    @Autowired
    private EventRepository eventRepository;

    // event simulator

    public List<Event> getAllEvent() {
        List<Event> events = new ArrayList<>();
        eventRepository.findAll().forEach(events::add);
        return events;
    }

    public Optional<Event> getEvent(long id) {
        return eventRepository.findById(id);
    }

	public void addEvent(Event event) {
        eventRepository.save(event);
	}

	public void updateEvent(Event event, long id) {
        eventRepository.save(event);
    }
    
    public void deleteEvent(long id) {
        eventRepository.deleteById(id);
    }

}