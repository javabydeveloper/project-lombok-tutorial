package com.javabydeveloper.lombok.constructor;

import java.beans.ConstructorProperties;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor(
		onConstructor_=
		@ConstructorProperties({"username"}))
public class RequiredArgsDemo5 {

	private Long id;

	@NonNull
	private String username;

}
