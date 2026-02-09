package com.example.eventmanagement.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.eventmanagement.service.EventService;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.eventmanagement.entity.Event;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;




@RestController
@RequestMapping("/event")
public class EventController {

    private final EventService service;

    public EventController(EventService service){
        this.service = service; 
    }

    @GetMapping("path")
    public List<Event> getEvents() {
        return service.getAllEvents();
    }

    @PostMapping
    public Event createEvent(@RequestBody Event event){
        return service.createEvent(event);
    }
    


}
