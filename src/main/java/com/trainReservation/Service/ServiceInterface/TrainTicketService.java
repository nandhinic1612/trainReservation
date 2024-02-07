package com.trainReservation.Service.ServiceInterface;

import com.trainReservation.Dto.TrainTicketDto;
import com.trainReservation.Entity.TrainTicket;
import org.springframework.stereotype.Service;

@Service
public interface TrainTicketService {
    TrainTicket purchaseTicket(TrainTicketDto trainReservationDto);
    TrainTicket getTicketById(Long id);
    void removeTicket(Long id);
    TrainTicket modifyTicketSeat(Long id, String newSeat);
}
