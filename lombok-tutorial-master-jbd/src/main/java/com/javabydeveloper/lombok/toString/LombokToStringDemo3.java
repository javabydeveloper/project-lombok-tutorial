package com.javabydeveloper.lombok.toString;

import java.time.LocalDate;

import lombok.ToString;

@ToString(exclude = { "id", "dateOfBirth" })
public class LombokToStringDemo3 {

	private Long id;

	private static boolean defaultStatus = false;

	private String name;

	private LocalDate dateOfBirth;

}
