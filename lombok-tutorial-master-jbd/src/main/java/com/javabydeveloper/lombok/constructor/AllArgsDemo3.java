package com.javabydeveloper.lombok.constructor;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class AllArgsDemo3 {

	private Long id;
	
	private static boolean defaultStatus;
	
	private final double minSalary = 10000.00;
	
	private final int defaultRole;
}
