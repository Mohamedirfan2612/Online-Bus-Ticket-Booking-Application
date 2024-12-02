package com.example.Online.Bus.Ticket.Booking.Application.Repository;

import com.example.Online.Bus.Ticket.Booking.Application.Entity.Bookings;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookingRepo extends JpaRepository<Bookings,Long> {
    List<Bookings> findByEmail(String email);
}
