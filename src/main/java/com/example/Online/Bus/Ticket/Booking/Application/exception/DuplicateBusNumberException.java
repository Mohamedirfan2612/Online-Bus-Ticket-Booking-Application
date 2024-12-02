package com.example.Online.Bus.Ticket.Booking.Application.exception;

public class DuplicateBusNumberException extends RuntimeException {
    public DuplicateBusNumberException(String message) {
        super(message);
    }
}
