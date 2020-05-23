package com.javabydeveloper.lombok.value;

import lombok.Value;

@Value(staticConstructor = "getInstance")
public class User3 {

	private Long id;

	private String username;
	
}
