package com.example.roles.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.roles.model.EmployeeContract;

@Repository
public interface EmployeeContractRepository extends JpaRepository<EmployeeContract, Integer> {

}
