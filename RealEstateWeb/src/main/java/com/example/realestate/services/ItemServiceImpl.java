package com.example.realestate.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.realestate.models.Item;
import com.example.realestate.repositories.ItemRepository;

@Service
public class ItemServiceImpl implements ItemService {

	@Autowired
	private final ItemRepository repository;

	public ItemServiceImpl(ItemRepository repository) {
		this.repository = repository;
	}

	@Override
	public List<Item> findAll() {
		return repository.findAll();
	}

}
