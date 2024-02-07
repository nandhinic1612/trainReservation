package com.trainReservation.Repository;

import com.trainReservation.Entity.TrainTicket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrainTicketRepo extends JpaRepository<TrainTicket,Long> {
}
