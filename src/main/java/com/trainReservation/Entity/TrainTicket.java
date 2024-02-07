package com.trainReservation.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.domain.EntityScan;
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@EntityScan
@Table(name = "train_ticket")
public class TrainTicket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",nullable = false)
    private Long id;

    @Column(name = "from",nullable = false)
    private String from;

    @Column(name = "to",nullable = false)
    private String to;

    @Column(name = "firstName",nullable = false)
    private String firstName;

    @Column(name = "lastName",nullable = false)
    private String lastName;

    @Column(name = "email",nullable = false)
    private String email;

    @Column(name = "pricePaid",nullable = false)
    private double pricePaid;

    @Column(name = "seat",nullable = false)
    private String seat;
}
