package com.example.realestate.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BuildingDTO {
	private int id;
	private String address;
	private int constructedIn;
	private int numOfFloors;
	private boolean hasParking;
	private boolean hasGarage;
	private boolean hasElevator;
	private boolean hasCctv;
	private boolean hasIntercom;
}
