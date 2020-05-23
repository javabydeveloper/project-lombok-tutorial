package com.javabydeveloper.lombok.constructor;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class RequiredArgsDemo2 {

	private Long id;

	@NonNull
	private String username = "anonymous";

	private final int defaultRole = 1;
	
	private static double minSalary = 10000.00;
}
