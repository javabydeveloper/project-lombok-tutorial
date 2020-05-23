package com.javabydeveloper.lombok.toString;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import lombok.ToString;

@ToString
public class LombokToStringDemo5 {

	private Long id;

	private static boolean defaultStatus = false;

	@ToString.Exclude
	private LocalDate dateOfBirth;
	
	@ToString.Include
	public String getDOB() {
		return this.dateOfBirth.
				format(DateTimeFormatter.ofPattern("dd-MMM-yy"));
	}
}
