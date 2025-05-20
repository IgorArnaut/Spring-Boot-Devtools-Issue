package com.example.realestate.models;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Apartment {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(nullable = false)
	private String location;
	@Column(nullable = false)
	private int floor;
	@Column(nullable = false)
	private int area;
	@Column(nullable = false)
	private int price;
	@Column(nullable = false)
	private int numOfRooms;
	@Column(nullable = false)
	private String state;
	@Column(nullable = false)
	private String heating;
	@Column(nullable = false)
	private String equipment;

	@ManyToOne(optional = false, fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private Building building;

//	@OneToMany(mappedBy = 'apartment')
//	private List<Listing> listings;

	@ManyToMany
	@JoinTable(name = "apartment_items", joinColumns = @JoinColumn(name = "apartment_id"), inverseJoinColumns = @JoinColumn(name = "item_id"))
	private List<Item> items = new ArrayList<Item>();
}
