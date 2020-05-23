package com.javabydeveloper.lombok.constructor;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class AllArgsDemo4 {

	private Long id;
	
	private String username;
	
}
