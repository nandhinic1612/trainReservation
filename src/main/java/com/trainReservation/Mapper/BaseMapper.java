package com.trainReservation.Mapper;

import org.mapstruct.Mapper;

import java.util.List;
@Mapper
public interface BaseMapper <E,M>{
    M toModel(E entity);

    E toEntity(M model);

    List<M> toModel(List<E> modelList);

    List<E> toEntity(List<M> entityList);
}
