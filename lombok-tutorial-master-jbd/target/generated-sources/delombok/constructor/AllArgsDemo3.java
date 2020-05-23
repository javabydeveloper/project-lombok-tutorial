package com.javabydeveloper.lombok.constructor;

public class AllArgsDemo3 {
	private Long id;
	private static boolean defaultStatus;
	private final double minSalary = 10000.0;
	private final int defaultRole;

	public Long getId() {
		return this.id;
	}

	public double getMinSalary() {
		return this.minSalary;
	}

	public int getDefaultRole() {
		return this.defaultRole;
	}

	public AllArgsDemo3(final Long id, final int defaultRole) {
		this.id = id;
		this.defaultRole = defaultRole;
	}
}
