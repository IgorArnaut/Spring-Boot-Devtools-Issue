package com.example.realestate.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Building {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(nullable = false)
	private String address;
	@Column(nullable = false)
	private int constructedIn;
	@Column(nullable = false)
	private int numOfFloors;
	@Column(nullable = false)
	private boolean hasParking;
	@Column(nullable = false)
	private boolean hasGarage;
	@Column(nullable = false)
	private boolean hasElevator;
	@Column(nullable = false)
	private boolean hasCctv;
	@Column(nullable = false)
	private boolean hasIntercom;

//	@OneToMany(mappedBy = 'building')
//	private List<Apartment> apartments;
}
