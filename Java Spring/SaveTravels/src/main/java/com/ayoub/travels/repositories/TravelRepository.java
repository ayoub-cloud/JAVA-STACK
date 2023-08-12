package com.ayoub.travels.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.ayoub.travels.models.Travel;

public interface TravelRepository extends CrudRepository<Travel, Long> {
    List<Travel> findAll();
}


