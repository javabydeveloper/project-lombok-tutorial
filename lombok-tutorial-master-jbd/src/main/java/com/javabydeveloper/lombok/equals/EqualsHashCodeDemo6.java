package com.javabydeveloper.lombok.equals;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class EqualsHashCodeDemo6 {
	
	@EqualsAndHashCode.Include
	private Long id;
	
	private double salary;
	
	private String email;
	
}
