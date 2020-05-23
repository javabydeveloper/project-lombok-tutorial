package com.javabydeveloper.lombok.constructor;

import lombok.NoArgsConstructor;

@NoArgsConstructor(force = true)
public class NoArgsDemo2 {

	private final Long id;
	
	private final String username;
	
	private final double minSalary;
	
	private final int defaultRole = 1;
	
	private static boolean status;
}
