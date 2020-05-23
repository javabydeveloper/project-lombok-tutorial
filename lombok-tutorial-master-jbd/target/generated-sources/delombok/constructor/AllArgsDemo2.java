package com.javabydeveloper.lombok.constructor;

import lombok.NonNull;

public class AllArgsDemo2 {
	private Long id;
	@NonNull
	private String username;

	public AllArgsDemo2(final Long id, @NonNull final String username) {
		if (username == null) {
			throw new NullPointerException("username is marked non-null but is null");
		}
		this.id = id;
		this.username = username;
	}
}
