package com.example.realestate.dtos;

import java.util.ArrayList;
import java.util.List;

public class ListingFormDTO {
	public BuildingDTO building = new BuildingDTO();
	public ApartmentDTO apartment = new ApartmentDTO();
	public List<Integer> items = new ArrayList<>();
	public TermsDTO terms = new TermsDTO();
	public ListingDTO listing = new ListingDTO();
}
