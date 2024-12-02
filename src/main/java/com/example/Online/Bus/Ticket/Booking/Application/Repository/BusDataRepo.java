package com.example.Online.Bus.Ticket.Booking.Application.Repository;

import com.example.Online.Bus.Ticket.Booking.Application.Entity.BusData;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BusDataRepo extends JpaRepository<BusData,Long> {

    List<BusData> findBySourceAndDestinationAndDate(String source, String destination, String date);
    boolean existsByBusNumber(String busNumber);
}

