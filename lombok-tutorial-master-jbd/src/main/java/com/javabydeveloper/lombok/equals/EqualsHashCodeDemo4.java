package com.javabydeveloper.lombok.equals;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode(exclude = {"name", "email"})
public class EqualsHashCodeDemo4 {
	
	private Long id;
	
	private String name;
	
	private String email;

}
