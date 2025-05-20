package com.example.realestate.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.realestate.models.Terms;

@Repository
public interface TermsRepository extends JpaRepository<Terms, Integer> {

}
