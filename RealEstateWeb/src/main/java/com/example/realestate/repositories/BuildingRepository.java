package com.example.realestate.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.realestate.models.Building;

@Repository
public interface BuildingRepository extends JpaRepository<Building, Integer> {

}
