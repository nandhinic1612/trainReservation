package com.trainReservation.Service.ServiceImpl;

import com.trainReservation.Dto.TrainTicketDto;
import com.trainReservation.Entity.TrainTicket;
import com.trainReservation.Repository.TrainTicketRepo;
import com.trainReservation.Service.ServiceInterface.TrainTicketService;
import com.trainReservation.Mapper.TrainTicketMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class TrainTicketServiceImpl implements TrainTicketService {
    private final TrainTicketRepo trainTicketRepo;
    private final TrainTicketMapper trainTicketMapper;

    @Autowired
    public TrainTicketServiceImpl(TrainTicketRepo trainTicketRepo, TrainTicketMapper trainTicketMapper) {
        this.trainTicketRepo = trainTicketRepo;
        this.trainTicketMapper = trainTicketMapper;
    }

    @Override
    public TrainTicket purchaseTicket(TrainTicketDto trainTicketDto) {
        TrainTicket trainTicket = trainTicketMapper.toEntity(trainTicketDto);
        return trainTicketRepo.save(trainTicket);
    }

    @Override
    public TrainTicket getTicketById(Long id) {
        return trainTicketRepo.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Ticket not found with id: " + id));
    }

    @Override
    public void removeTicket(Long id) {
        trainTicketRepo.deleteById(id);
    }

    @Override
    public TrainTicket modifyTicketSeat(Long id, String newSeat) {
        TrainTicket ticket = trainTicketRepo.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Ticket not found with id: " + id));
        ticket.setSeat(newSeat);
        return trainTicketRepo.save(ticket);
    }
}
