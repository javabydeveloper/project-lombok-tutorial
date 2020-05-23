package com.javabydeveloper.lombok.value;

import lombok.Builder;
import lombok.Builder.Default;
import lombok.Value;

@Builder @Value
public class User5 {

	private Long id;

	private String username;
	
	@Default
	private boolean active = true;
	
	@Default 
	private int role = 3;
	
}
