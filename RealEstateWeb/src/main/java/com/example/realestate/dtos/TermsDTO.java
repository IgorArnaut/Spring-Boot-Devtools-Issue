package com.example.realestate.dtos;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TermsDTO {
	private int id;
	private LocalDate availableOn;
	private boolean hasDeposit;
	private boolean isForStudents;
	private boolean isForWorkers;
	private boolean isSmokingAllowed;
	private boolean arePetsAllowed;
}
