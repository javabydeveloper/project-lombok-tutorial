package com.javabydeveloper.lombok.constructor;

import lombok.NonNull;

public class RequiredArgsDemo1 {
	private Long id;
	@NonNull
	private String username;
	@NonNull
	private String email;
	private final boolean status;

	public RequiredArgsDemo1(@NonNull final String username, @NonNull final String email, final boolean status) {
		if (username == null) {
			throw new NullPointerException("username is marked non-null but is null");
		}
		if (email == null) {
			throw new NullPointerException("email is marked non-null but is null");
		}
		this.username = username;
		this.email = email;
		this.status = status;
	}
}
