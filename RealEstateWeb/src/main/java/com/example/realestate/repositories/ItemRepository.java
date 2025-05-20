package com.example.realestate.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.realestate.models.Item;

@Repository
public interface ItemRepository extends JpaRepository<Item, Integer> {
	List<Item> findByIdIn(List<Integer> ids);
}
