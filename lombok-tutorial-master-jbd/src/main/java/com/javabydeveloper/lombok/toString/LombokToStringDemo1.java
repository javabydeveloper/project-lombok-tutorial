package com.javabydeveloper.lombok.toString;

import lombok.NonNull;
import lombok.ToString;

@ToString
public class LombokToStringDemo1 {
	
	private Long id;
	
	@NonNull
	private String name;
	
	private static boolean defaultStatus = false;

}
