package com.javabydeveloper.lombok.constructor;

import lombok.AccessLevel;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
public class RequiredArgsDemo3 {

	private Long id;

	@NonNull
	private String username;
	
}
