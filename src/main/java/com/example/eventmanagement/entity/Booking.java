package com.example.eventmanagement.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class Booking {
    @Id
    private Long id;

    private User user ;

    private Event event;
    //no of tickets
    private Integer ticketBooked;

    private Integer ticketPrice;

    //ticket status booked/cancelled
    private Integer bookingStatus;

    private Double totalAmount;

    //payment status
    private Integer paymentStatus;

    private LocalDateTime createdAt;

    protected void onCreate() {
        this.createdAt = LocalDateTime.now();
    }

    public void setEvent(Event event2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setEvent'");
    }

    public void setTicketsBooked(Integer ticketsBooked) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setTicketsBooked'");
    }

    public void setBookingStatus(String string) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setBookingStatus'");
    }

    public void setPaymentStatus(String string) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setPaymentStatus'");
    }

    public void setTotolAmount(Double totalAmount2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setTotolAmount'");
    }
  

}
