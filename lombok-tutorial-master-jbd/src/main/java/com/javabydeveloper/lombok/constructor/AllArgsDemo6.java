package com.javabydeveloper.lombok.constructor;

import java.beans.ConstructorProperties;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor(
		onConstructor_=
		@ConstructorProperties({"id", "username"}))
public class AllArgsDemo6 {

	private Long id;
	
	private String username;
	
}
