package com.example.Online.Bus.Ticket.Booking.Application.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookDto {
    private String name;
    private String email;
    private String phoneNumber;
    private Integer age;
    private String gender;
}