package com.example.realestate.models;

import java.time.LocalDate;

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
public class Terms {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(nullable = false)
	private LocalDate availableOn;
	@Column(nullable = false)
	private boolean hasDeposit;
	@Column(nullable = false)
	private boolean isForStudents;
	@Column(nullable = false)
	private boolean isForWorkers;
	@Column(nullable = false)
	private boolean isSmokingAllowed;
	@Column(nullable = false)
	private boolean arePetsAllowed;
}
