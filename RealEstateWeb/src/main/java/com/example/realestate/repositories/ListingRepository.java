package com.example.realestate.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.realestate.models.Listing;

@Repository
public interface ListingRepository extends JpaRepository<Listing, Integer> {

}
