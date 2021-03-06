package com.example.spring.Reprository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.spring.model.Passenger;
@Repository
public interface PassengerRepo extends JpaRepository<Passenger, Long> {

}
