package com.example.eventmanagement.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.eventmanagement.entity.Event;
import com.example.eventmanagement.repository.EventRepository;

@Service
public class EventService {

    private final EventRepository repository;

    EventService(EventRepository repository){
        this.repository = repository;
    }
 
    public List<Event> getAllEvents(){
        return repository.findAll();
    }

    public Event createEvent(Event event){
        return repository.save(event);
    }

}
