package com.javabydeveloper.lombok.toString;

import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
public class LombokToStringDemo9 {

	@ToString.Include(name = "userId", rank=1)
	private Long id;
	
	@ToString.Include(name = "userName", rank=2)
	private String name;
	
	private boolean status;
	
}
