package com.javabydeveloper.lombok.toString;

import lombok.ToString;

@ToString(onlyExplicitlyIncluded = true)
public class LombokToStringDemo6 {

	private Long id;

	@ToString.Include
	private String name;
	
}
