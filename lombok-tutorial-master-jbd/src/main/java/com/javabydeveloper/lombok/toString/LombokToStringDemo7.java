package com.javabydeveloper.lombok.toString;

import lombok.ToString;

@ToString(of = {"id", "status"})
public class LombokToStringDemo7 {

	private Long id;
	
	private String name;
	
	private boolean status;
	
}
