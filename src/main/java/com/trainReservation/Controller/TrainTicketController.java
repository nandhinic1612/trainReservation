package com.trainReservation.Controller;

import com.trainReservation.Dto.TrainTicketDto;
import com.trainReservation.Entity.TrainTicket;
import com.trainReservation.Service.ServiceInterface.TrainTicketService;
import com.trainReservation.Mapper.TrainTicketMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class TrainTicketController {
    private final TrainTicketService trainTicketService;
    private final TrainTicketMapper trainTicketMapper;

    @Autowired
    public TrainTicketController(TrainTicketService trainTicketService, TrainTicketMapper trainTicketMapper) {
        this.trainTicketService = trainTicketService;
        this.trainTicketMapper = trainTicketMapper;
    }

    @PostMapping("/purchase")
    public ResponseEntity<TrainTicketDto> purchaseTicket(@RequestBody TrainTicketDto trainTicketDto) {
        TrainTicket ticket = trainTicketService.purchaseTicket(trainTicketDto);
        TrainTicketDto ticketDto = trainTicketMapper.toModel(ticket);
        return ResponseEntity.created(null).body(ticketDto);
    }

    @GetMapping("/{id}")
    public ResponseEntity<TrainTicketDto> getTicketById(@PathVariable Long id) {
        TrainTicket ticket = trainTicketService.getTicketById(id);
        TrainTicketDto ticketDto = trainTicketMapper.toModel(ticket);
        return ResponseEntity.ok(ticketDto);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> removeTicket(@PathVariable Long id) {
        trainTicketService.removeTicket(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/{id}/seat/{newSeat}")
    public ResponseEntity<TrainTicketDto> modifyTicketSeat(@PathVariable Long id, @PathVariable String newSeat) {
        TrainTicket ticket = trainTicketService.modifyTicketSeat(id, newSeat);
        TrainTicketDto ticketDto = trainTicketMapper.toModel(ticket);
        return ResponseEntity.ok(ticketDto);
    }
}
