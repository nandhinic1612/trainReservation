package com.trainReservation.Mapper;

import com.trainReservation.Dto.TrainTicketDto;
import com.trainReservation.Entity.TrainTicket;
import org.mapstruct.Mapper;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.springframework.stereotype.Component;

@Component
@Mapper(componentModel = "spring", nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface TrainTicketMapper extends BaseMapper<TrainTicket, TrainTicketDto> {
}
