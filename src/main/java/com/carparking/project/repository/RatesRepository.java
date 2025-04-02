package com.carparking.project.repository;

import com.carparking.project.entities.Rates;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RatesRepository extends CrudRepository<Rates, Integer> {


    Rates findByadminMailId(String emailid);
}