package com.example.roles.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.roles.model.EmployeePermanent;

@Repository

public interface EmployeePermanentRepository extends JpaRepository<EmployeePermanent, Integer> {

}
