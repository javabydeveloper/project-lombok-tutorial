package com.javabydeveloper.lombok.constructor;

import java.beans.ConstructorProperties;
import lombok.NonNull;

public class RequiredArgsDemo5 {
	private Long id;
	@NonNull
	private String username;

	@ConstructorProperties({"username"})
	public RequiredArgsDemo5(@NonNull final String username) {
		if (username == null) {
			throw new NullPointerException("username is marked non-null but is null");
		}
		this.username = username;
	}
}
