package com.example.eventmanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.eventmanagement.entity.Booking;
import com.example.eventmanagement.entity.Event;
import com.example.eventmanagement.repository.BookingRepository;
import com.example.eventmanagement.repository.EventRepository;
import com.example.eventmanagement.repository.UserRepository;

public class BookingService {

    private final BookingRepository bookingRepository;
    private final UserRepository userRepository;
    private final EventRepository eventRepository;
    
    BookingService(BookingRepository bookingRepository , UserRepository userRepository,
                          EventRepository eventRepository){
        this.bookingRepository = bookingRepository;
        this.userRepository = userRepository;
        this.eventRepository = eventRepository;
    }

    public Booking createBooking(Long userId , Long eventId , Integer ticketsBooked){

        User user = userRepository.findById(userId).orElse(null);

        Event event = eventRepository.findById(eventId).orElse(null);
        
        if (user == null || event == null) {
            return null; // later we will replace this with proper exception
        }

        Double totalAmount = event.getPrice()*ticketsBooked;

        Booking booking = new Booking();

        booking.setUser(user);
        booking.setEvent(event);
        booking.setTicketsBooked(ticketsBooked);
        booking.setBookingStatus("BOOKED");
        booking.setPaymentStatus("PENDING");
        booking.setTotolAmount(totalAmount);

        return bookingRepository.save(booking);
    }

    public List<Booking> getAllBookings(){
        return bookingRepository.findAll();
    }

    public Booking getBookingById(Long id){
        return bookingRepository.findById(id).orElse(null);
    }

    public Booking cancelBooking(Long bookingId){
        Booking booking = bookingRepository.findById(bookingId).orElse(null);

        if(booking == null){
            return null;
        }

        booking.setBookingStatus("CANCELLED");
        booking.setPaymentStatus("FAILED");

        return bookingRepository.save(booking);
    }
}
