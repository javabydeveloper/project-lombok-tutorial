package com.javabydeveloper.lombok.toString;

import java.time.LocalDate;

public class LombokToStringDemo3 {
	private Long id;
	private static boolean defaultStatus = false;
	private String name;
	private LocalDate dateOfBirth;

	@Override
	public String toString() {
		return "LombokToStringDemo3(name=" + this.name + ")";
	}
}
