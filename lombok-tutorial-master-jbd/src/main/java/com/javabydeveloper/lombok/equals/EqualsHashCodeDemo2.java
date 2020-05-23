package com.javabydeveloper.lombok.equals;

import java.time.LocalDate;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode
public class EqualsHashCodeDemo2 {
	
	private Long id;
	
	private static int defaultRole = 1;
	
	private LocalDate dob;
	
	private transient String dobString;

}
