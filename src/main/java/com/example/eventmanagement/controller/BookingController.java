package com.example.eventmanagement.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.eventmanagement.entity.Booking;
import com.example.eventmanagement.service.BookingService;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;



@RestController
@RequestMapping("/api/bookings")
public class BookingController {
    BookingService bookingService;

    BookingController(BookingService bookingService){
        this.bookingService = bookingService;
    }

    @PostMapping
    public ResponseEntity<Booking> createBooking(@RequestParam Long userId , @RequestParam Long eventId ,@RequestParam Integer ticketBooked) {
        //TODO: process POST request
        Booking booking = bookingService.createBooking(userId , eventId , ticketBooked);
        if(booking == null){
            return ResponseEntity.badRequest().build();
        }

        return ResponseEntity.ok(booking);
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<Booking> getBookingById(@PathVariable Long id){

        Booking booking = bookingService.getBookingById(id);
        if(booking == null){
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(booking);
    }

    @GetMapping
    public ResponseEntity<List<Booking>> getAllBooking() {
        return ResponseEntity.ok(bookingService.getAllBookings());
    }

    @PutMapping("/{id}/cancel")
    public ResponseEntity<Booking> cancelBooking(@PathVariable Long id) {
        //TODO: process PUT request
        Booking booking = bookingService.cancelBooking(id);
        if(booking == null){
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(booking);
    }
    
}
