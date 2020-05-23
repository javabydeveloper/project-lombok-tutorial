package com.javabydeveloper.lombok.constructor;

import lombok.NonNull;

public class RequiredArgsDemo3 {
	private Long id;
	@NonNull
	private String username;

	private RequiredArgsDemo3(@NonNull final String username) {
		if (username == null) {
			throw new NullPointerException("username is marked non-null but is null");
		}
		this.username = username;
	}
}
