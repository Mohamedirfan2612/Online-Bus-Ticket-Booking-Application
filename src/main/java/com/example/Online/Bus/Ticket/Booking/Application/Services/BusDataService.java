package com.example.Online.Bus.Ticket.Booking.Application.Services;

import com.example.Online.Bus.Ticket.Booking.Application.Dto.BusDataDto;

import java.util.List;

public interface BusDataService {

    BusDataDto addBus(BusDataDto busDataDto) ;
    BusDataDto updateBus(BusDataDto busDataDto, Long id);
    void deleteBus(Long id) ;
    BusDataDto viewBus(Long id) ;
    List<BusDataDto> viewAllBus();
    List<BusDataDto> searchBuses(String source, String destination, String date);


}