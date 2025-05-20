package com.example.realestate.controllers;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.example.realestate.dtos.ApartmentDTO;
import com.example.realestate.dtos.BuildingDTO;
import com.example.realestate.dtos.ItemDTO;
import com.example.realestate.dtos.ListingDTO;
import com.example.realestate.dtos.TermsDTO;

public class Listings {

	private final BuildingDTO building1 = new BuildingDTO(1, "Alekse Šantica 4, Novi Sad", 2009, 1, true, false, false,
			true, true);
	private final BuildingDTO building2 = new BuildingDTO(2, "Kolo srpskih sestara, Novi Sad", 2004, 4, true, true,
			true, true, true);

	private final List<ItemDTO> items = new ArrayList<>(Arrays.asList(new ItemDTO(1, "Krevet"),
			new ItemDTO(2, "Plakar"), new ItemDTO(3, "Klima"), new ItemDTO(4, "Telefon"), new ItemDTO(5, "TV"),
			new ItemDTO(6, "Internet"), new ItemDTO(7, "Kuhinjski elementi"), new ItemDTO(8, "Mikrotalasna"),
			new ItemDTO(9, "Šporet"), new ItemDTO(10, "Rerna"), new ItemDTO(11, "Rešo"), new ItemDTO(12, "Frižider"),
			new ItemDTO(13, "Zamrzivač"), new ItemDTO(14, "Sudomašina"), new ItemDTO(15, "Veš mašina"),
			new ItemDTO(16, "Kancelarijski nameštaj"), new ItemDTO(17, "Terasa"), new ItemDTO(18, "Lođa")));

	private final ApartmentDTO apartment1 = new ApartmentDTO(1, "Grbavica", 0, 30, 30, 0, "Izvorno", "Gradsko",
			"Namešten", building1, Arrays.asList(items.get(0), items.get(1), items.get(3), items.get(5)));
	private final ApartmentDTO apartment2 = new ApartmentDTO(2, "Grbavica", 1, 30, 300, 0, "Izvorno", "Gradsko",
			"Namešten", building2,
			Arrays.asList(items.get(0), items.get(1), items.get(2), items.get(3), items.get(4), items.get(5),
					items.get(6), items.get(8), items.get(9), items.get(11), items.get(12), items.get(14),
					items.get(15)));

	private final TermsDTO terms1 = new TermsDTO(1, LocalDate.now(), true, false, false, false, false);
	private final TermsDTO terms2 = new TermsDTO(2, LocalDate.of(2025, 1, 1), true, true, false, false, false);

	public List<ListingDTO> listings = new ArrayList<>(Arrays.asList(
			new ListingDTO(1, "A", "Opis za oglas A", LocalDateTime.now(), LocalDateTime.now(), terms1, apartment1),
			new ListingDTO(2, "B", "Opis za oglas B", LocalDateTime.now(), LocalDateTime.now(), terms2, apartment2)));

}
