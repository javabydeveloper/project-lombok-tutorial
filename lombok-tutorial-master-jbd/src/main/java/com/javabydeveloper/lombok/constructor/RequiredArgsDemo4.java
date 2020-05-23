package com.javabydeveloper.lombok.constructor;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor(staticName = "getInstance")
public class RequiredArgsDemo4 {

	private Long id;

	@NonNull
	private String username;

	@NonNull
	private String email;

	private final boolean status;
	
}
