package com.javabydeveloper.lombok.constructor;

import lombok.AllArgsConstructor;
import lombok.NonNull;

@AllArgsConstructor
public class AllArgsDemo2 {

	private Long id;
	
	@NonNull
	private String username;
}
