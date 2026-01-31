package com.example.eventmanagement.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    String name ;
    Double price;
    String location;
    int startTime ;
    int endTime;


    Event(){
    }

    Event(long id , String name ,  Double price ,String location , int startTime , int endTime){
        this.id = id;
        this.name = name;
        this.price = price;
        this.location = location;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    
    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public Double getPrice(){
        return price;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getLocation(){
        return location;
    }
    public void setLocation(String location){
        this.location = location;
    }

    public int getStartTime(){
        return startTime;
    }
    public void setStartTime(int startTime ){
        this.startTime = startTime;
    }
     public int getEndTime(){
        return startTime;
    }
    public void setEndTime(int endTime){
        this.endTime = endTime;
    }




}
