package com.javabydeveloper.lombok.constructor;

public class NoArgsDemo2 {
	private final Long id;
	private final String username;
	private final double minSalary;
	private final int defaultRole = 1;
	private static boolean status;

	public NoArgsDemo2() {
		this.id = null;
		this.username = null;
		this.minSalary = 0.0;
	}
}
