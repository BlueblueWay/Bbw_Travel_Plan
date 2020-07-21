package com.travel.demo.restservice;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EventController {

    @Autowired
    private EventService eventService;

    @GetMapping("/user/{id}/events")
    public List<Event> getAllEvent(@PathVariable long id) {

        return eventService.getAllEvent(id);
    }

    @GetMapping("/event/{id}")
    public Optional<Event> getEvent(@PathVariable long id) {
        //PathVariable can be done like PathVariable("foo")
        return eventService.getEvent(id);
    }

    @RequestMapping(method=RequestMethod.POST, value = "/event")
    public void addEvent(@RequestBody Event event) {
        eventService.addEvent(event);
    }

    @RequestMapping(method=RequestMethod.PUT, value = "/event/{id}")
    public void updateEvent(@RequestBody Event event, @PathVariable long id) {
        eventService.updateEvent(event, id);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/event/{id}")
    public void deleteEvent(@RequestBody Event event, @PathVariable long id) {
        eventService.deleteEvent(id);
    }
}