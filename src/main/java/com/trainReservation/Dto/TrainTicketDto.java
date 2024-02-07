package com.trainReservation.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TrainTicketDto {
    private String from;
    private String to;
    private String firstName;
    private String lastName;
    private String email;
    private double pricePaid;
    private String seat;
}
