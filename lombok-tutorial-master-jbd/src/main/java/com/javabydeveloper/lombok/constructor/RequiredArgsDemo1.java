package com.javabydeveloper.lombok.constructor;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class RequiredArgsDemo1 {

	private Long id;

	@NonNull
	private String username;

	@NonNull
	private String email;

	private final boolean status;

}
