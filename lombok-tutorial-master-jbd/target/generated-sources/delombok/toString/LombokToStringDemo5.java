package com.javabydeveloper.lombok.toString;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LombokToStringDemo5 {
	private Long id;
	private static boolean defaultStatus = false;
	private LocalDate dateOfBirth;

	public String getDOB() {
		return this.dateOfBirth.format(DateTimeFormatter.ofPattern("dd-MMM-yy"));
	}

	@Override
	public String toString() {
		return "LombokToStringDemo5(id=" + this.id + ", getDOB=" + this.getDOB() + ")";
	}
}
