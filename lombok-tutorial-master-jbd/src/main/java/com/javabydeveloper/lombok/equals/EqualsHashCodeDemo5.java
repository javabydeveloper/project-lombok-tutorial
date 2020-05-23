package com.javabydeveloper.lombok.equals;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode
public class EqualsHashCodeDemo5 {
	
	private Long id;
	
	@EqualsAndHashCode.Exclude
	private double salary;
	
	@EqualsAndHashCode.Include
	private boolean isHighPay() {
		return this.salary > 100000.00;
	}
	
}
