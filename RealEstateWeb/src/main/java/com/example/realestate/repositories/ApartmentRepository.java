package com.example.realestate.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.realestate.models.Apartment;

@Repository
public interface ApartmentRepository extends JpaRepository<Apartment, Integer> {

}
