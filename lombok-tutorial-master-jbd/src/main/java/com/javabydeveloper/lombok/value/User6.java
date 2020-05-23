package com.javabydeveloper.lombok.value;

import lombok.Setter;
import lombok.Value;
import lombok.experimental.NonFinal;

@Value
@Setter
@NonFinal
public class User6 {

	private Long id;

	@NonFinal
	private String username;
	
	public final String defaultStatus = "inactive";
	
	public static int defaultRole = 2;
		
}
