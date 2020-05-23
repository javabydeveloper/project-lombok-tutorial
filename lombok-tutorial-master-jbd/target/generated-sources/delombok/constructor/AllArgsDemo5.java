package com.javabydeveloper.lombok.constructor;

public class AllArgsDemo5 {
	private Long id;
	private String username;

	private AllArgsDemo5(final Long id, final String username) {
		this.id = id;
		this.username = username;
	}

	public static AllArgsDemo5 getInstance(final Long id, final String username) {
		return new AllArgsDemo5(id, username);
	}

	public AllArgsDemo5() {
	}
}
