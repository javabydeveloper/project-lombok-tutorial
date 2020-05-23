package com.javabydeveloper.lombok.settergetter;

import java.time.LocalDate;
import java.util.Date;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Employee {

	private Long id;
	
	@Setter(AccessLevel.PUBLIC)
	private String name;
	
	@Setter(AccessLevel.PRIVATE)
	private String email;
	
	@Setter(value = AccessLevel.PROTECTED)
	private LocalDate lastUpdated;
	
	@Getter(AccessLevel.NONE)
	private boolean active;
	
	private transient Date dateOfBirth;
	
	public static String defaultStatus = "PENDING";
}
