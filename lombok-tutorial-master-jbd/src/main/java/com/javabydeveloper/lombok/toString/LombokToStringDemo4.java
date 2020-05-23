package com.javabydeveloper.lombok.toString;

import java.time.LocalDate;

import lombok.ToString;

@ToString
public class LombokToStringDemo4 {

	private Long id;

	private static boolean defaultStatus = false;

	@ToString.Exclude
	private String name;

	@ToString.Exclude
	private LocalDate dateOfBirth;

}
