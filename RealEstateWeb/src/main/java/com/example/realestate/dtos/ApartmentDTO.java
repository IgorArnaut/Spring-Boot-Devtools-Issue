package com.example.realestate.dtos;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ApartmentDTO {
	private int id; 
	private String location;
	private int floor;
	private int area; 
	private int price;
	private int numOfRooms;
	private String state;
	private String heating;
	private String equipment;
	
	private BuildingDTO building;
	
	private List<ItemDTO> items = new ArrayList<ItemDTO>();
}
