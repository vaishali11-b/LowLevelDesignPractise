package com.example.eventmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.eventmanagement.entity.Booking;

public interface BookingRepository extends JpaRepository<Booking , Long>{

}
