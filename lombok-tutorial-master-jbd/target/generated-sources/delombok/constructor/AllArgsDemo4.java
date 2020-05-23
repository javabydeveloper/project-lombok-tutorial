package com.javabydeveloper.lombok.constructor;

public class AllArgsDemo4 {
	private Long id;
	private String username;

	private AllArgsDemo4(final Long id, final String username) {
		this.id = id;
		this.username = username;
	}
}
