package com.example.realestate.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.realestate.dtos.ListingDTO;
import com.example.realestate.dtos.ListingFormDTO;
import com.example.realestate.models.Item;
import com.example.realestate.services.ItemService;

@Controller
@RequestMapping("/oglasi")
public class ListingController {

	@Autowired
	private final ItemService itemServ;

	public ListingController(ItemService itemServ) {
		this.itemServ = itemServ;
	}

	@GetMapping("/")
	public String index(Model model) {
		Listings listingsContainer = new Listings();
		List<ListingDTO> listings = listingsContainer.listings;
		model.addAttribute("listings", listings);
		return "listings/index.html";
	}

	@GetMapping("/postavka")
	public String createPage(Model model) {
		ListingFormDTO listingFormDTO = new ListingFormDTO();
		List<Item> allItems = itemServ.findAll();

		allItems.forEach((item) -> System.out.println("ID: " + item.getId() + ", name: " + item.getName()));
		model.addAttribute("listingFormDTO", listingFormDTO);
		model.addAttribute("allItems", allItems);
		return "listings/create.html";
	}
}
